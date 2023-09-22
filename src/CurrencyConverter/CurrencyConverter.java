package CurrencyConverter;
import javax.swing.JOptionPane;

public class CurrencyConverter {
    public void ConvertCoToUSD(double valor) {
        double USDCoin = valor / 3939.00;
        USDCoin = (double) Math.round(USDCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +USDCoin+ " Dolares");
    }

    public void ConvertCoToEUR(double valor) {
        double EURCoin = valor / 4250.48;
        EURCoin = (double) Math.round(EURCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +EURCoin+ " Euros");
    }

    public void ConvertCoToPound(double valor) {
        double PoundCoin = valor / 4890.52;
        PoundCoin = (double) Math.round(PoundCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +PoundCoin+ " Libras Esterlinas");
    }

    public void ConvertCoToYen(double valor) {
        double YenCoin = valor / 29.68;
        YenCoin = (double) Math.round(YenCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +YenCoin+ " Yuanes");
    }

    public void ConvertCoToWon(double valor) {
        double monedaWon = valor / 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
    }

}
