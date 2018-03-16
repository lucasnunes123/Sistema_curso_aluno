/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wendell
 */
/**
 *  Classe de criação de um Curso, os dados colocados nessa classe iram para o banco.
*/
public class Curso {
    private int idCurso;
    private String curso;
    private int duracao;
    private String descricao;
    /**
     * Contrutor da classe curso com todos os atributos.
     * @param idCurso Numero de indentificação do curso.
     * @param curso nome do curso.
     * @param duracao duração do curso.
     * @param descricao decrião;
     */
    public Curso(int idCurso, String curso, int duracao, String descricao) {
        this.idCurso = idCurso;
        this.curso = curso;
        this.duracao = duracao;
        this.descricao = descricao;
    }
    /**
     * Contrutor da classe curso sem os atributos idCurso .
     * @param curso nome do curso.
     * @param duracao duração do curso.
     * @param descricao decrião;
     */
    public Curso(String curso, int duracao, String descricao) {
        this.curso = curso;
        this.duracao = duracao;
        this.descricao = descricao;
    }
    /**
     * Contrutor vazio.
     */
    public Curso(){
        
    }
    /**
     * @return idCurso. 
     */
    public int getIdCurso() {
        return idCurso;
    }
    /**
     * @param idCurso Usado par colocar o id do curso.
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    /**
     * @return nome do curso.
     */
    public String getCurso() {
        return curso;
    }
    /**
     * @param curso Usado para colocaqr o nome de curso.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    /**
     * @return a duração do curso.
     */
    public int getDuracao() {
        return duracao;
    }
    /**
     * @param duracao Usado par colocar o tempo do curso.
     */
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    /**
     * @return descricao.
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * @param descricao String bem longa
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Metodo que vai mostra todos os atribos e dados da tabela curso. 
     */
    public void mostrarTudo(){
        System.out.println("IdCurso: " + getIdCurso());
        System.out.println("Curso: " + getCurso());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Decrição: " + getDescricao());
    }
    
}
