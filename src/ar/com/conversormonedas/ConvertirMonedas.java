package ar.com.conversormonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    
    public void ConvertirPesosArgentinosADolares(double valor){
        double monedaDolar = valor / 137.71;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaDolar+" Dolares");
    }

    public void ConvertirPesosArgentinosAEuros(double valor){
        double monedaEuro = valor / 137.26;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaEuro+" Euros");
    }
}
