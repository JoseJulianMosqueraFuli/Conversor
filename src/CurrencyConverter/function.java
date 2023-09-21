package CurrencyConverter;

import javax.swing.JOptionPane;
public class function {
    CurrencyConverter monedas = new CurrencyConverter();
    CurrencyConverterToCO pesos = new CurrencyConverterToCO();

    public void ConverterCoins(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
                "Seleccion")).toString();
        switch(opcion) {
            case "De Pesos a Dólar":
                monedas.ConvertCoToUSD(Minput);
                break;
            case "De Pesos a Euro":
                monedas.ConvertCoToEUR(Minput);
                break;
            case "De Pesos a Libras":
                monedas.ConvertCoToPound(Minput);
                break;
            case "De Pesos a Yen":
                monedas.ConvertCoToYen(Minput);
                break;
            case "De Pesos a Won Coreano":
                monedas.ConvertCoToWon(Minput);
                break;
            case "De Dólar a Pesos":
                pesos.ConvertUSDToCO(Minput);
                break;
            case "De Euro a Pesos":
                pesos.ConvertEURToCo(Minput);
                break;
            case "De Libras a Pesos":
                pesos.ConvertPoundToCo(Minput);
                break;
            case "De Yen a Pesos":
                pesos.ConvertYenToCo(Minput);
                break;
            case "De Won Coreano a Pesos":
                pesos.ConvertWonToCo(Minput);
                break;
        }
    }
}
