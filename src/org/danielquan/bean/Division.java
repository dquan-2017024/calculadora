/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.danielquan.bean;
import javax.swing.JOptionPane;
/** 
 *
 * Programador: Daniel Enrique Quán Cruz
 * Código Tecnico: IN5AM
 * No. Carnet: 2017024
 */

public class Division {
    private double num1;
    private double num2;
    private double res;

    public Division(double num1, double num2, double res) {
        this.num1 = num1;
        this.num2 = num2;
        this.res = res;
    }
    
    public Division(){
        this.num1 = 0;
        this.num2 = 0;
        this.res = 0;
    }
    
    public double capturarNum1(){
        this.num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer dato"));
        return num1;
    }
    
    public double capturarNum2(){
        this.num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo dato"));
        if(0 == num2){
            JOptionPane.showMessageDialog(null, "Error de dato, el divisor no puede ser 0");
            }
        return num2;
    }  
    
    public double calculoDivision(){
        this.res = num1/num2;
        return res;
    }
    
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null, "El resultado de la division es: " + res);
    }
}
