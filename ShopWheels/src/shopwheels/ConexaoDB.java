/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopwheels;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe
 */
public class ConexaoDB {
    
    public static Connection abrir(){
        
        try {
            Connection conexaoDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShopWheels", "root", "");
            return conexaoDB;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Conexao abrir" + e.getMessage());
            return null;
        }
        
    }
    
}
