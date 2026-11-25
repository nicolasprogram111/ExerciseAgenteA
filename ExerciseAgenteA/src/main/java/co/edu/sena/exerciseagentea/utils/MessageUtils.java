/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.exerciseagentea.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Aprendiz
 */
public class MessageUtils {
    private static MessageUtils instance;

    private MessageUtils() {}

    public static MessageUtils getInstance() {
        if (instance == null) {
            instance = new MessageUtils();
        }
        return instance;
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showInfo(String message) {
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}
    

