package ar.com.conversormonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
    
    public void ConvertirPesosArgentinosADolares(double valor){
        double monedaDolar = valor / 142.27;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaDolar+" Dolares");
    }

    public void ConvertirPesosArgentinosAEuros(double valor){
        double monedaEuro = valor / 144.05;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaEuro+" Euros");
    }

    public void ConvertirPesosArgentinosALibras(double valor){
        double monedaLibra = valor / 166.19;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaLibra+" Libras");
    }

    public void ConvertirPesosArgentinosAYen(double valor){
        double monedaYen = valor / 1;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaYen+" Yenes");
    }

    public void ConvertirPesosArgentinosAWon(double valor){
        double monedaWon = valor / 0.1;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tiene $"+monedaWon+" Wones Coreanos");
    }
}
