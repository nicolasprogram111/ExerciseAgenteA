/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.db;

import static co.edu.sena.exerciseagentea.db.DBConnection.connection;
import static co.edu.sena.exerciseagentea.db.DBConnection.statement;
import co.edu.sena.exerciseagentea.model.Shed;
import co.edu.sena.exerciseagentea.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 **Fecha: 25/11/26
 * @author Aprendiz
 * Objetivo:Clase para conexion a tabla shed
 * 
 */
public class DBShed extends DBConnection {
    
    public void insert(Shed shed)
    {
        try {
            connect();            
            String sql = "insert into shed(name, status) values (?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, shed.getNumber());
            ps.setString(2, shed.getStatus());
            ps.executeUpdate();
            ps.close();            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al insertar al galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
    

public void update(Shed shed)
    {
        try {
            connect();            
            String sql = "update shed set name = ? status = ? where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, shed.getNumber());
            ps.setString(2, shed.getStatus());
            ps.setInt(3, shed.getId());
            ps.executeUpdate();
            ps.close();            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al modificar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }

public void delete(int id)
    {
        try {
            connect();            
            String sql = "delete from shed where id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);            
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al eliminar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
}

public List<Shed> findAll()
    {
        List<Shed> result = new ArrayList<>();
        try {
            connect();
            String query = "select * from shed";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            while(resultSet.next())
            {
                Shed shed = new Shed(resultSet.getInt("id"), resultSet.getInt("number"),
                resultSet.getString("status"));
                result.add(shed);
            }
            
            resultSet.close();
            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar los galpones " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return result;
    }

public Shed find(int id)
    {
        Shed shed = null;
        try {
            connect();
            String query = "select * from line where id = ?";
            PreparedStatement ps = connection.prepareCall(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            
            if(resultSet.next())
            {
                shed = new Shed(resultSet.getInt("id"), resultSet.getInt("number"),
                resultSet.getString("status"));                
            }
            
            resultSet.close();
            ps.close();            
        } catch (SQLException e) {
            MessageUtils.getInstance().showError("Error al consultar el galpon " + e.getMessage());
        }
        finally
        {
            disconnect();
        }
        
        return shed;
    }
}
