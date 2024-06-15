/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zlaifer
 */
public class Conexion {
    
    Connection Conectar;
    String Patch="jdbc:mysql://localhost:3306/";
    String Bd="tesocartera";
    String Usuario="root";
    String Pass="tesocartera";
    
    public Connection Conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conectar=DriverManager.getConnection(Patch+Bd,Usuario,Pass);
            if (Conectar!=null) {
                System.out.println("La Conexion Se Realizo Con Exito");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error En La Conexion");
        }
        
        return Conectar;
    }
    
}
