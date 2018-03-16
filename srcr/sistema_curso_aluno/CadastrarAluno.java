/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_curso_aluno;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Wendell
 */
public class CadastrarAluno extends Application {
    private static Stage primaryStage;
    /**
     *  Contrutor do JavaFx para contruir todas as cenas.
    */
    public void Launch(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/CadastrarAluno.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Cadastrar Aluno");
        stage.show();
        stage.setScene(scene);
        setPrimaryStage(stage);
    }
     /**
     * Metodo usado para retonar o stage dessa tela.
     * @return primaryStage
    */
    public static Stage getStage() {
        return primaryStage;
    }
    /**
     * Metodo usado para setar um stage.
     * @param stage Stage da tela Login
    */
    public static void setPrimaryStage(Stage stage) {
        CadastrarAluno.primaryStage = stage;
    }
    
}
