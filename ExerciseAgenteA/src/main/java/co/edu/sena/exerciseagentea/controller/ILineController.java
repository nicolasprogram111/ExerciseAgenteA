/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Line;

/**
 *
 * @author nicol
 */
public interface ILineController {
    public void register(Line line) throws Exception;
    public void modify(Line line) throws Exception;
    public void delete(int codeLine) throws Exception;
    public Line find(int codeLine)throws Exception;
    public java.util.List<Line> findAll() throws Exception;
    
}
