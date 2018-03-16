/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import JDBC.Banco;
import Model.Curso;
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
 * Classe responsavel por mandar os dados de um curso para o banco. 
 */
public class CursoDAO {
    private Connection connection;
    
    /**
     * Construtor da classe CursoDAO responsavel por fazer a conexão com o banco de dados.
     */
    public CursoDAO(){
        this.connection = new Banco().getConnection();
    }
    /**
     * Metodo responsavel por adicionar um curso no banco de dados.
     * @param curso Curso passado para poder adicionar no banco.
     * @return True ou False
     */
    public boolean add(Curso curso){
        String add = "Insert into Curso(curso,duracao,descricao) values(?,?,?);";
        try {
            PreparedStatement stmt = connection.prepareStatement(add);
            stmt.setString(1, curso.getCurso());
            stmt.setInt(2, curso.getDuracao());
            stmt.setString(3, curso.getDescricao());
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
     * Metodo responsavel por atualizar um curso no banco de dados.
     * @param curso Curso passado para poder ser atualizado no banco. 
     * @return True ou False.
     */
    public boolean upadate(Curso curso){
        String update = "Update Curso Set curso = ?, duracao = ?, descricao = ? where idCurso = ?;";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(update);
            stmt.setString(1, curso.getCurso());
            stmt.setInt(2, curso.getDuracao());
            stmt.setString(3, curso.getDescricao());
            stmt.setInt(4, curso.getIdCurso());
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
     * Metodo responsavel por deletar um curso no banco de dados.
     * @param curso Curso passado para poder ser deletado no banco.
     * @return 
     */
    public boolean delete(Curso curso){
        String delete = "Delete From Curso Where idCurso = ?;";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(delete);
            stmt.setInt(1, curso.getIdCurso());
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
     * Metodo responsavel por mostrar os dados de um curso no banco de dados.
     * @return cursos 
     */
    public List<Curso> getList(){
        List<Curso> cursos = new ArrayList<>();
        String select = "Select * from Curso";
        try {
            PreparedStatement stmt = connection.prepareStatement(select);
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next()){
                Curso curso = new Curso();
                curso.setIdCurso(resultado.getInt("idCurso"));
                curso.setCurso(resultado.getString("curso"));
                curso.setDuracao(resultado.getInt("duracao"));
                curso.setDescricao((resultado.getString("descricao")));
                cursos.add(curso);
            }
            stmt.close();
            resultado.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro, Lista não foi retornada" + ex);
            return null;
        }
        return cursos;
    }
}
