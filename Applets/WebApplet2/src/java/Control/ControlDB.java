/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
public class ControlDB {
    public void conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
        }
    }
}
