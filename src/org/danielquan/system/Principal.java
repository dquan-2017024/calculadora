
package org.danielquan.system;
import javax.swing.JOptionPane;
import org.danielquan.bean.Suma;
import org.danielquan.bean.Resta;
import org.danielquan.bean.Multiplicacion;
import org.danielquan.bean.Division;
/**
 * 
 * Programador: Daniel Enrique Quán Cruz
 * Codigo Tecnico: IN5AM
 * No. Carnet: 2017024
 */
public class Principal { 

   
    public static void main(String[] args) {
         int opcion;
        boolean salir = true;
        do{
        
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operacion:\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir"));

        
        switch(opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "Suma");
                Suma suma = new Suma();
                suma.capturarNum1();
                suma.capturarNum2();
                suma.calculoSuma();
                suma.mostrarResultado();
            break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "Resta");
                Resta resta = new Resta();
                resta.capturarNum1();
                resta.capturarNum2();
                resta.calculoResta();
                resta.mostrarResultado();
            break;
            
            case 3:
                JOptionPane.showMessageDialog(null, "Multiplicacion");
                Multiplicacion multiplicacion = new Multiplicacion();
                multiplicacion.capturarNum1();
                multiplicacion.capturarNum2();
                multiplicacion.calculoMult();
                multiplicacion.mostrarResultado();
            break;
            
            case 4:
                JOptionPane.showMessageDialog(null, "Division");
                Division division = new Division();
                division.capturarNum1();
                division.capturarNum2();
                division.calculoDivision();
                division.mostrarResultado();
            break;
            
            case 5:
                salir = false;
            break;
        }  
        }while(salir = false);        
        
    }

}


