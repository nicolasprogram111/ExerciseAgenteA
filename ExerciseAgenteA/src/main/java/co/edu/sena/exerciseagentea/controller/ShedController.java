/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class ShedController implements IShedController{
   
private ArrayList<Shed> sheds = new ArrayList<>();

    @Override
    public void register(Shed shed) {
        sheds.add(shed);
    }

    @Override
    public void modify(Shed shed) {
        for (Shed s : sheds) {
            if (s.getNumber() == shed.getNumber()) {
                s.setState(shed.getState());
            }
        }
    }

    @Override
    public void delete(int numberShed) {
        for (int i = 0; i < sheds.size(); i++) {
            if (sheds.get(i).getNumber() == numberShed) {
                sheds.remove(i);
                break;
            }
        }
    }

    @Override
    public Shed find(int numberShed) {
        for (Shed s : sheds) {
            if (s.getNumber() == numberShed) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Shed> findAll() {
        return sheds;
    }
}

   
    

