/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.DriverManager;
import java.sql.Connection;



/**
 *
 * @author Unicesumar
 */
public class ConnectionFactory {
    private static final String USER = "root";
    private static final String SENHA = "";
    private static final String URL = "jdbc:mysql://localhost:3306/steam";

    public static Connection criarConexao()throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection(URL,USER,SENHA);
        
        return conn;
    }
    
    public static void main(String[] args) throws Exception{
        Connection c =criarConexao();
        
        if(c != null){
            System.out.println("Conexão obtida com sucesso!\n"+c);
        }else{
            System.out.println("Conexão nula!");
        }
    }
}
