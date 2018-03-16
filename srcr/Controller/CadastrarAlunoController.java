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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Wendell e Lucas
 */
public class CadastrarAlunoController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIdade;
    @FXML
    private TextField txtSexo;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtRg;
    @FXML
    private TextField txtResponsavel;
    @FXML
    private TextField txtCurso;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnCadastrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
