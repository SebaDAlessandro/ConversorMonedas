package ar.com.principal;

import javax.swing.*;

import ar.com.conversormonedas.OpcionesConversion;
import ar.com.conversortemperaturas.OpcionesTemperaturas;

public class Principal {
    public static void main(String[] args) {

        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesTemperaturas temperatura = new OpcionesTemperaturas();
        
        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de monedas", "Conversor de temperatura"}, "Elegir").toString();
            
            switch(opciones){
                case "Conversor de monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese Valor");
                if(ValidarNumero(input)==true){
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirMonedas(valorRecibido);
                

                    int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión?");
                    if(JOptionPane.OK_OPTION == respuesta){
                        System.out.println("Selecciona opción Afirmativa");
                    }else{
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");                
                }
                break;

                case "Conversor de temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);
    
                        int resp = 0;
                        resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if((resp == 0) && (ValidarNumero(input) == true)) { 
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");                     
                        }
    
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
                    break;
            }
        }

    }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
