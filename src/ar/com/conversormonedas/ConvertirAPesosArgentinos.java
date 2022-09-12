package ar.com.conversormonedas;

import javax.swing.JOptionPane;

public class ConvertirAPesosArgentinos {
    
    public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 142.27;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Argentinos");
	}

    public void ConvertirEurosAPesos(double valor) {
		double monedaEuros = valor * 144.05;
		monedaEuros = (double) Math.round(monedaEuros *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuros+ " Pesos Argentinos");
	}

    public void ConvertirLibrasAPesos(double valor) {
		double monedaLibras = valor * 166.19;
		monedaLibras = (double) Math.round(monedaLibras *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibras+ " Pesos Argentinos");
	}

    public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 1;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Argentinos");
	}

    public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.1;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Argentinos");
	}
}
