package ar.com.principal;

import javax.swing.*;

import ar.com.conversormonedas.OpcionesConversion;

public class Principal {
    public static void main(String[] args) {

        OpcionesConversion conversion = new OpcionesConversion();
        
        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de monedas", "Conversor de temperatura"}, "Elegir").toString();
            
            switch(opciones){
                case "Conversor de monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese Valor");
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirMonedas(valorRecibido);

                int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversión");
                if(JOptionPane.OK_OPTION == respuesta){
                    System.out.println("Selecciona opción Afirmativa");
                }else{
                    JOptionPane.showMessageDialog(null, "Programa Terminado");
                }

                break;
            }
        }

    }
}
