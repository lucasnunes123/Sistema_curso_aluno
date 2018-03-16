/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sistema_curso_aluno.CadastrarAluno;
import sistema_curso_aluno.Principal;

/**
 * FXML Controller class
 *
 * @author Wendell
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button btnCadastrarCurso;
    @FXML
    private Button btnListarCurso;
    @FXML
    private Button btnListarAluno;
    @FXML
    private Button btnCadastrarAluno;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    btnCadastrarAluno.setOnMouseClicked((event) -> {
        cadastrarAluno();
    });
    }
    /**
     * Metodo responsavel por chamar a tela de cadastrar aluno.
     */
    public void cadastrarAluno(){
        CadastrarAluno aluno = new CadastrarAluno();
        Principal.getStage().close();
        try {
            aluno.start(new Stage());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     /**
     * Metodo responsavel por fechar uma tela.
     */
    public void fechar(){
        Principal.getStage().close();
    }
}
