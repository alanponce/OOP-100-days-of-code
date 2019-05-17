/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class metodos_sql {

    private static Connection conexion;
    private static PreparedStatement sentencia_preparada;
    private static ResultSet resultado;

    public void guardar_datos_articulo(String serie, String articulo, String modelo, String procedencia, int fecha) {
        try {
            conexion = conexion_bd.conectar();
            String consulta = "INSERT INTO datos_articulo (serie,articulo,modelo,procedencia,fecha)VALUES (?,?,?,?,?)";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, serie);
            sentencia_preparada.setString(2, articulo);
            sentencia_preparada.setString(3, modelo);
            sentencia_preparada.setString(4, procedencia);
            sentencia_preparada.setInt(5, fecha);
            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {

                JOptionPane.showMessageDialog(null, "Datos Guardar");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar datos");
            }

            conexion.close();
        } catch (HeadlessException | SQLException e) {

            System.out.println("Error:" + e);
        } finally {
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error:" + e);
            }
        }
    }

    public static String buscarserie(String serie) {
        String mensaje = null;

        try {
            conexion = conexion_bd.conectar();
            String consulta = "SELECT curp From datos_empleado WHERE serie = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);
            sentencia_preparada.setString(1, serie);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {

                mensaje = "Existe serie";
            } else {
                mensaje = "No Existe serie";
            }

            conexion.close();

        } catch (SQLException e) {
            System.out.println("Error:" + e);
        } finally {

            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(metodos_sql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje;
    }

    public void modificar_datos_articulo(String articulo, String modelo, String procedencia, int fecha, String serie) {
        try {
            conexion = conexion_bd.conectar();
            String consulta = "UPDATE datos_articulo SET articulo = ?, modelo = ?, procedencia = ?, fecha = ? WHERE serie = ?";
            sentencia_preparada = conexion.prepareStatement(consulta);

            sentencia_preparada.setString(1, articulo);
            sentencia_preparada.setString(2, modelo);
            sentencia_preparada.setString(3, procedencia);
            sentencia_preparada.setInt(4, fecha);
            sentencia_preparada.setString(5, serie);

            int i = sentencia_preparada.executeUpdate();

            if (i > 0) {
                JOptionPane.showMessageDialog(null, "datos modificados");
            } else {
                JOptionPane.showMessageDialog(null, "datos no modificados");
            }
            conexion.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }

}
