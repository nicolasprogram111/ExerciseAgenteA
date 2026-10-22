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
   
    private final List<Shed> sheds = new ArrayList<>();

    @Override
    public void register(Shed shed) throws Exception {
        validate(shed);
        if (find(shed.getNumber()) != null) {
            throw new Exception("Ya existe un galpón con el número " + shed.getNumber());
        }
        sheds.add(shed);
    }

    @Override
    public void modify(Shed shed) throws Exception {
        validate(shed);
        Shed existing = find(shed.getNumber());
        if (existing == null) {
            throw new Exception("No existe un galpón con el número " + shed.getNumber());
        }
        existing.setState(shed.getState());
    }

    @Override
    public void delete(int numberShed) throws Exception {
        Shed existing = find(numberShed);
        if (existing == null) {
            throw new Exception("No existe un galpón con el número " + numberShed);
        }
        sheds.remove(existing);
    }

    @Override
    public Shed find(int numberShed) {
        for (Shed shed : sheds) {
            if (shed.getNumber() == numberShed) {
                return shed;
            }
        }
        return null;
    }

    @Override
    public List<Shed> findAll() {
        return new ArrayList<>(sheds);
    }

    private void validate(Shed shed) throws Exception {
        if (shed == null) {
            throw new Exception("El galpón no puede ser nulo");
        }
        if (shed.getNumber() <= 0) {
            throw new Exception("El número del galpón debe ser mayor a cero");
        }
        if (shed.getState() == null || shed.getState().trim().isEmpty()) {
            throw new Exception("El estado del galpón es obligatorio");
        }
    }
}


 

