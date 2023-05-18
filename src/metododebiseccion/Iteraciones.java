/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metododebiseccion;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author yeison
 */
public class Iteraciones {

    
    public static void main(String[] args) {
        
        // Solicita valor del intervalo a
        String aValue = JOptionPane.showInputDialog("Ingrese el valor de a:");
        double a = Double.parseDouble(aValue);

        // Solicita valor del intervalo b
        String bValue = JOptionPane.showInputDialog("Ingrese el valor de b:");
        double b = Double.parseDouble(bValue);

        // E = error
        double E = 0.001;

        // Logaritmo 2
        int log = 2;

        // Formula iteraciones con variables definidas
        double formula = (b - a);
        double f1 = formula / E;
        double c = Math.log10(f1);
        double d = Math.log10(log);

        // Formatear los resultados a 4 decimales
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        String cFormatted = decimalFormat.format(c);
        String dFormatted = decimalFormat.format(d);
        String iterationsFormatted = decimalFormat.format(c / d);

        String message = "Logaritmo de f1: " + cFormatted + "\n"
                + "Logaritmo de log: " + dFormatted + "\n"
                + iterationsFormatted + " Numero de Iteraciones";

        JOptionPane.showMessageDialog(null, message); // Mostrar resultados en un solo cuadro de diálogo
    }
    
    
}
