/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.db.DBLine;
import co.edu.sena.exerciseagentea.model.Line;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */

  
    

    public class LineController implements ILineController {
    private DBLine dbLine = new DBLine();
    private List<Line> lineList = DataStore.getLineList();

    @Override
    public void insert(Line line) throws Exception {
        if(line == null)
        {
            throw new Exception("La Línea está vacía");
        }
        
        if("".equals(line.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        dbLine.insert(line);
    }

    public void update(Line line) throws Exception {
        if(line == null)
        {
            throw new Exception("La Línea está vacía");
        }
        
        if(line.getId() == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(line.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        //verificar existencia de la linea a actualizar
        Line lineExist = find(line.getId());
        if(lineExist == null)
        {
            throw new Exception("No existe el registro a actualizar");
        }
        
        dbLine.update(line);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        //verificar existencia de la linea a eliminar
        Line lineExist = find(id);
        if(lineExist == null)
        {
            throw new Exception("No existe el registro a eliminar");
        }
        
        dbLine.delete(id);
    }

    @Override
    public Line find(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        return dbLine.find(id);
    }

    @Override
    public List<Line> findAll() throws Exception {
        return dbLine.findAll();
    }
    
}

