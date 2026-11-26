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
    private int id;
    private int number;
    private String status;
    
    public Shed() {
    }

    public Shed(int id, int number, String status) {
        this.id = id;
        this.number = number;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return number + " - " + status;
    }

    
}
