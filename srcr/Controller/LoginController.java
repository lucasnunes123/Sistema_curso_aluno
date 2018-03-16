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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sistema_curso_aluno.Login;
import sistema_curso_aluno.Principal;

/**
 * FXML Controller class
 *
 * @author Wendell e Lucas.
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Button btnSair;
    @FXML
    private Button btnEntrar;
    
 
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnEntrar.setOnMouseClicked((event) -> {
            logar();
        });
        btnSair.setOnMouseClicked((event) -> {
            fechar();
        });
    }
    /**
     * Metodo responsavel por fechar uma tela.
     */
    public void fechar(){
        Login.getStage().close();
    }
    /**
     * Metodo responsavel por verificar se uma pessoa pode entrar.
     */
    public void logar(){
        if("root".equals(txtNome.getText()) && "1234".equals(txtSenha.getText())){
            Principal prin = new Principal();
            fechar();
            try {
                prin.start(new Stage());
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("Login invalido");
            alerta.setContentText("O erro aconteceu devido o usuario invalido");
            alerta.show();
            
        }
    }
    
}
