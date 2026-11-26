/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.db.DBShed;
import co.edu.sena.exerciseagentea.model.Shed;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class ShedController implements IShedController{
   
 private DBShed dbShed = new DBShed();
    
    @Override
    public void insert(Shed shed) throws Exception {
        if(shed == null)
        {
            throw new Exception("El galpón está vacío");
        }
        
        if(shed.getNumber() == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        dbShed.insert(shed);
    }

    @Override
    public void update(Shed shed) throws Exception {
        if(shed == null)
        {
            throw new Exception("El galpón está vacío");
        }
        
        if(shed.getId() == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        if(shed.getNumber() == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        if("".equals(shed.getStatus()))
        {
            throw new Exception("El estado es obligatorio");
        }
        
        Shed shedExist = find(shed.getId());
        if(shedExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbShed.update(shed);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        //verificar existencia del galpon a eliminar
        Shed shedExist = find(id);
        if(shedExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbShed.delete(id);
    }

    @Override
    public Shed find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El número es obligatorio");
        }
 
        return dbShed.find(id);
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return dbShed.findAll();
    }
    
}
   
    

