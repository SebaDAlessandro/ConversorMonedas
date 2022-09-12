package ar.com.conversormonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
    
    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirAPesosArgentinos pesos = new ConvertirAPesosArgentinos();  
    
    public void ConvertirMonedas(double valor) {
        
        String opciones = JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Seleccion").toString();

        switch (opciones) {
            case "De Pesos a Dólar": 
                monedas.ConvertirPesosArgentinosADolares(valor);
                break;
            case "De Pesos a Euros": 
                monedas.ConvertirPesosArgentinosAEuros(valor);
                break;
            case "De Pesos a Libras": 
                monedas.ConvertirPesosArgentinosALibras(valor);
                break;
            case "De Pesos a Yenes": 
                monedas.ConvertirPesosArgentinosAYen(valor);
                break;
            case "De Pesos a Won Coreano": 
                monedas.ConvertirPesosArgentinosAWon(valor);
                break;
            case "De Dólar a Pesos": 
                pesos.ConvertirDolaresAPesos(valor);;
                break;
            case "De Euros a Pesos":
                pesos.ConvertirEurosAPesos(valor);
                break;
            case "De Libras a Pesos":
                pesos.ConvertirLibrasAPesos(valor);
                break;
            case "De Yen a Pesos":
                pesos.ConvertirYenAPesos(valor);
                break;
            case "De Won Coreano a Pesos":
                pesos.ConvertirWonAPesos(valor);
                break;
        }
    }
    
}