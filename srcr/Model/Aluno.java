/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wendell e Lucas
 */
/**
 *  Classe de criação de um aluno, os dados colocados nessa classe iram para o banco.
*/
public class Aluno {
    private int idAluno;
    private String nome;
    private int idade;
    private String sexo;
    private int cpf;
    private int rg;
    private String responsavel;
    private int idCurso;
    private String email;
    private String senha;
    /**
     * Construtor da classe aluno com todos os atributos.
     * @param idAluno Id do aluno.
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     * @param sexo sexo do aluno, M ou F.
     * @param cpf cpf do aluno.
     * @param rg Rg do aluno.
     * @param responsavel Nome do responsavel do aluno.
     * @param curso Id do Curso escolhido pelo aluno.
     * @param email Email do aluno.
     * @param senha Senha do aluno.
     */
    public Aluno(int idAluno, String nome, int idade, String sexo, int cpf, int rg, String responsavel, int curso, String email,String senha) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.responsavel = responsavel;
        this.idCurso = curso;
        this.email = email;
        this.senha = senha;
    }
    /**
     * Construtor da classe aluno sem os atributos idAluno e email.
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     * @param sexo sexo do aluno, M ou F.
     * @param cpf cpf do aluno.
     * @param rg Rg do aluno.
     * @param responsavel Nome do responsavel do aluno.
     * @param curso Id do Curso escolhido pelo aluno.
     * @param senha Senha do aluno.
     * */
    public Aluno(String nome, int idade, String sexo, int cpf, int rg, String responsavel, int curso,String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.responsavel = responsavel;
        this.idCurso = curso;
        this.senha = senha;
    }
    /**
     * Construtor da classe aluno sem o atributos idAluno.
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     * @param sexo sexo do aluno, M ou F.
     * @param cpf cpf do aluno.
     * @param rg Rg do aluno.
     * @param responsavel Nome do responsavel do aluno.
     * @param curso Id do Curso escolhido pelo aluno.
     * @param email
     * @param senha Senha do aluno.
     */
    public Aluno(String nome, int idade, String sexo, int cpf, int rg, String responsavel, int curso, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.responsavel = responsavel;
        this.idCurso = curso;
        this.email = email;
        this.senha = senha;
    }
    /**
     * Construtor vazio.
    */
    public Aluno() {

    }
    /**
     * @return id do aluno.
    */
    public int getIdAluno() {
        return idAluno;
    }
    /**
     * @param idAluno Usado para inserir um inteiro no idAluno.
    */
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    /**
     * @return nome do aluno.
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome Usado para colocar o nome do aluno.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return idade do aluno. 
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @param idade Usado para colocar a idade do aluno.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @return sexo do aluno, M ou F.
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * @param sexo Usado para colocar o sexo de aluno.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * @return O cpf do aluno.
     */
    public int getCpf() {
        return cpf;
    }
    /**
     * @param cpf Usado para colocar o cpf do aluno.
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    /**
     * @return rg do aluno. 
     */
    public int getRg() {
        return rg;
    }
    /**
     * @param rg Usado para colocar o rg do aluno.
     */
    public void setRg(int rg) {
        this.rg = rg;
    
    }
    /**
     * @return O nome do Responsavel do aluno.
     */
    public String getResponsavel() {
        return responsavel;
    }
    /**
     * 
     * @param responsavel Usado para colocar o nome do responsavel pelo aluno.
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    /**
     * @return idCurso do curso que o aluno está fazendo. 
     */
    public int getIdCurso() {
        return idCurso;
    }
    /**
     * @param idCurso Usado para colocar o numero do curos escolhido 
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    /**
     * @return email do aluno.
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email Usado para colocar o email do aluno.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return senha da conta do aluno.
     */
    public String getSenha() {
        return senha;
    }
    /**
     * @param senha Usado par colocar a senha do aluno.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * Metodo que mostra todos os atributos da classe aluno.
     */
    public void mostraAluno(){
        System.out.println("id: " +getIdAluno());
        System.out.println("Nome: " +getNome());
        System.out.println("Idade: " +getIdade());
        System.out.println("Sexo: " +getSexo());
        System.out.println("CPF: " +getCpf());
        System.out.println("RG: " +getRg());
        System.out.println("Curso: " +getIdCurso());
        System.out.println("Email: " +getEmail());
        System.out.println("Senha: " +getSenha());
    }
    
}
