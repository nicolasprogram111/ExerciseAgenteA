/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.data.DataStore;
import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class ShedController implements IShedController{
   
 private List<Shed> shedList = DataStore.getShedList();
    
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
        
        shedList.add(shed);
    }

    @Override
    public void update(Shed shed) throws Exception {
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
        
        //verificar existencia del galpon a actualizar
        boolean exists = false;
        for (int i = 0; i < shedList.size(); i++) {
            if(shedList.get(i).getNumber() == shed.getNumber())
            {
                shedList.set(i, shed);  //actualiza
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("El galpon no existe");
        } 
    }

    @Override
    public void delete(int number) throws Exception {
        if(number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        //verificar existencia del galpon a eliminar
        boolean exists = false;
        for (int i = 0; i < shedList.size(); i++) {
            if(shedList.get(i).getNumber() == number)
            {
                shedList.remove(i); //eliminar
                exists = true;
                break;
            }
        }
        
        if(!exists)
        {
            throw new Exception("El galpon no existe");
        }
    }

    @Override
    public Shed find(int number) throws Exception {
        if(number == 0)
        {
            throw new Exception("El número es obligatorio");
        }
        
        Shed shed = null;
        for (Shed s : shedList) {
            if(s.getNumber() == number)
            {
                shed = s;
                break;
            }
        }
        
        return shed;
    }

    @Override
    public List<Shed> findAll() throws Exception {
        return shedList;
    }
    
}
   
    

