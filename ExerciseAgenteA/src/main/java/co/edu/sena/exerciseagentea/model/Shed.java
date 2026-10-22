/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.model;

/**
 * Fecha: 22/10/2026
 *
 * @author:Nicolas Medina Micolta Objetivo: modelo departamentos
 *
 */
public class Shed {

    private int number;
    private String state;

    public Shed() {
    }

    public Shed(int number, String state) {
        this.number = number;
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Shed{" + "number=" + number + ", state=" + state + '}';
    }

    
}
