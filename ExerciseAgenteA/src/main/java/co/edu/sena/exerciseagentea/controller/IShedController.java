/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Shed;

/**
 *
 * @author Aprendiz
 */
  public interface IShedController {
 
    public void register(Shed shed) throws Exception;
    public void modify(Shed shed) throws Exception;
    public void delete(int numberShed) throws Exception;
    public Shed find(int numberShed)throws Exception;
    public java.util.List<Shed> findAll() throws Exception;
}
   


