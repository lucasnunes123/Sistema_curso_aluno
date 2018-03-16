/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
    //private static final boolean USAR_TIME_ZONE = true;
    //private static final String TIME_ZONE = "?serverTimezone=America/New_York";

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
    //private static Connection connection;
 *
    private static final String SENHA = "sql20010329";
    private static final String DRIVER_BANCO = "com.mysql.cj.jdbc.Driver";
 * @author Wendell
 */
public class Banco {
    
    //private static final String URL = "jdbc:mysql://localhost:3306/trabalho_do_denilson";
    private static final String SERVIDOR = "localhost";
    private static final String NOME_DO_BANCO = "trabalho_do_denilson";
    private static final String PORTA = "3306";
    private static final String USUARIO = "root";
    private static final String SENHA = "sql20010329";
    
    public Connection getConnection() {        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://"+SERVIDOR+":"+PORTA+"/"+NOME_DO_BANCO
                    , USUARIO, SENHA);
            
        } catch (SQLException ex) {
            System.out.println("Deu ERROOO!!!!!! Você é um merda.");
            throw new RuntimeException(ex);
        }
    }    
}
     