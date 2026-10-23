/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.controller;

import co.edu.sena.exerciseagentea.model.Line;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class LineController {
   

    private ArrayList<Line> lines = new ArrayList<>();
    private int counter = 1;

    public void register(String name) {
        lines.add(new Line(counter, name));
        counter++;
    }

    public void modify(int code, String name) {
        for (Line l : lines) {
            if (l.getCode() == code) {
                l.setName(name);
            }
        }
    }

    public void delete(int code) {
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).getCode() == code) {
                lines.remove(i);
                break;
            }
        }
    }

    public ArrayList<Line> getAll() {
        return lines;
    }
}
    

