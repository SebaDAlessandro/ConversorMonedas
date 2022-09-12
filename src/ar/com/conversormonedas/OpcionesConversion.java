package ar.com.conversormonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
    
    ConvertirMonedas monedas = new ConvertirMonedas();    
    
    public void ConvertirMonedas(double valor) {
        
        String opciones = JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir su dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Seleccion").toString();

        switch (opciones) {
            case "De Pesos a Dólar": 
                monedas.ConvertirPesosArgentinosADolares(valor);
                break;
            case "De Pesos a Euros": 
                monedas.ConvertirPesosArgentinosAEuros(valor);
                break;
              
        
            default:
                break;
        }
    }
    
}