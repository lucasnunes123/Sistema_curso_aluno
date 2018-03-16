/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Banco;
import Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wendell
 */
/**
 * Classe responsavel por  
 */
public class AlunoDAO {
    private Connection connection;
    /**
     * Construtor da classe alunoDAO responsavel por fazer a conexão com o banco de dados.
     */
    public AlunoDAO() {
        this.connection = new Banco().getConnection();
    }
    /**
     * Metodo responsavel por adicionar um aluno no banco de dados.
     * @param aluno Aluno passado para poder ser adicionado no banco de dados.
     * @return True ou False.
     */
    public boolean add(Aluno aluno){
        String add = "Insert into Aluno(nome,idade,sexo,cpf,rg,responsavel,idCurso,email,senha) values(?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement stmt = connection.prepareStatement(add);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, String.valueOf(aluno.getSexo()));
            stmt.setInt(4, aluno.getCpf());
            stmt.setInt(5, aluno.getRg());
            stmt.setString(6, aluno.getResponsavel());
            stmt.setInt(7, aluno.getIdCurso());
            stmt.setString(8, aluno.getEmail());
            stmt.setString(9, aluno.getSenha());
            stmt.execute();
            stmt.close();
            connection.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /**
     * Metodo responsavel por atualizar um aluno no banco de dados.
     * @param aluno Aluno passado para poder ser atualizado no banco de dados.
     * @return True ou False.
     */
    public boolean upadate(Aluno aluno){
        String update = "Update Aluno Set nome = ?, email = ?, cpf = ?, rg = ?, senha = ? where idAluno = ?;";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(update);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setInt(3, aluno.getCpf());
            stmt.setInt(4, aluno.getRg());
            stmt.setString(5, aluno.getSenha());
            stmt.setInt(6, aluno.getIdAluno());
            stmt.execute();
            stmt.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /**
     * Metodo responsavel por deletar um aluno no banco de dados.
     * @param aluno Aluno passado para poder ser deletado no banco de dados.
     * @return True ou False.
     */
    public boolean delete(Aluno aluno){
        String delete = "Delete From Aluno Where idAluno = ?;";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(delete);
            stmt.setInt(1, aluno.getIdAluno());
            stmt.execute();
            stmt.close();
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    /**
     * Metodo responsavel por mostrar os dados de um aluno no banco de dados.
     * @return alunos.
     */
    public List<Aluno> getList(){
        List<Aluno> alunos = new ArrayList<>();
        String select = "Select * from Aluno";
        try {
            PreparedStatement stmt = connection.prepareStatement(select);
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next()){
                Aluno cao = new Aluno();
                cao.setIdAluno(resultado.getInt("idAluno"));
                cao.setNome(resultado.getString("nome"));
                cao.setIdade(resultado.getInt("idade"));
                cao.setSexo((resultado.getString("sexo")));
                cao.setCpf(resultado.getInt("cpf"));
                cao.setRg(resultado.getInt("rg"));
                cao.setResponsavel(resultado.getString("responsavel"));
                cao.setIdCurso(resultado.getInt("idCurso"));
                cao.setEmail(resultado.getString("email"));
                cao.setSenha(resultado.getString("senha"));
                alunos.add(cao);
            }
            stmt.close();
            resultado.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro, Lista não foi retornada" + ex);
            return null;
        }
        return alunos;
    }
}
