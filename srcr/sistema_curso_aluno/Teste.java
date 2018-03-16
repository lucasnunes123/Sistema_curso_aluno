/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_curso_aluno;

import Model.Aluno;
import DAO.AlunoDAO;
import DAO.CursoDAO;
import Model.Curso;
import java.util.List;

/**
 *
 * @author Wendell e Lucas
 *  Classe para testes.
 */
public class Teste {
    public static void main(String[] args) {
        /*
        Aluno aluno = new Aluno("Marcos",17,"M",1234567121,1234567657,"João", 1, "vamoqvamo@localhost","123qwe123qwe");
        AlunoDAO daoA = new AlunoDAO();
        if(daoA.add(aluno)){
            System.out.println("Cadastrado");
        }else{
            System.out.println("Not cadastrado");
        }*/
        
        /*Aluno aluno = new Aluno();
        aluno.setIdAluno(7);
        aluno.setNome("Matheus");
        aluno.setCpf(11111112);
        aluno.setRg(1231231);
        AlunoDAO daoA = new AlunoDAO();
        if(daoA.upadate(aluno)){
            System.out.println("Atualizado");
        }else{
            System.out.println("Not Atualizado");
        }*/
        
        /*
        Aluno aluno = new Aluno();
        aluno.setIdAluno(7);
        AlunoDAO daoA = new AlunoDAO();
        if(daoA.delete(aluno)){
            System.out.println("Deletado");
        }else{
            System.out.println("Not Deletado");
        }*/
        
        /*AlunoDAO alunoDao = new AlunoDAO();
        List<Aluno> alunos = alunoDao.getList();
        if(alunos != null){
            for(int x = 0; x < alunos.size(); x++){
               alunos.get(x).mostraAluno();
            }
            System.out.println("-----------------------------------");
        }else{
            System.out.println("Lista Nula");
        }*/
        
        /*
        Curso curso = new Curso("POO",200,"É top de +++++");
        CursoDAO daoC = new CursoDAO();
        if(daoC.add(curso)){
            System.out.println("Cadastrado");
        }else{
            System.out.println("Not cadastrado");
        }*/
        
        /*
        Curso curso = new Curso();
        curso.setIdCurso(2);
        curso.setCurso("POO2");
        curso.setDuracao(100);
        curso.setDescricao("É incrivel");
        CursoDAO daoC = new CursoDAO();
        if(daoC.upadate(curso)){
            System.out.println("Atualizado");
        }else{
            System.out.println("Not Atualizado");
        }*/
        
        /*
        Curso curso = new Curso();
        curso.setIdCurso(2);
        CursoDAO daoC = new CursoDAO();
        if(daoC.delete(curso)){
            System.out.println("Deletado");
        }else{
            System.out.println("Not Deletado");
        }*/
        
        /*CursoDAO cursoDao = new CursoDAO();
        List<Curso> cursos = cursoDao.getList();
        if(cursos != null){
            for(int x = 0; x < cursos.size(); x++){
                cursos.get(x).mostrarTudo();
            }
            System.out.println("--------------------------------");
        }else{
            System.out.println("Not visualizado");
        }*/
    }
}
        
