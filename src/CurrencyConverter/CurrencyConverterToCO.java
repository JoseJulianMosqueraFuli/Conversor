package CurrencyConverter;

import javax.swing.JOptionPane;
public class CurrencyConverterToCO {
    public void ConvertUSDToCO(double valor) {
        double USDCoin = valor * 3939.00;
        USDCoin = (double) Math.round(USDCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +USDCoin+ " Pesos Colombianos");
    }

    public void ConvertEURToCo(double valor) {
        double EURCoin = valor * 4250.48;
        EURCoin = (double) Math.round(EURCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +EURCoin+ " Pesos Colombianos");
    }

    public void ConvertPoundToCo(double valor) {
        double PundCoin = valor * 4890.52;
        PundCoin = (double) Math.round(PundCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +PundCoin+ " Pesos Colombianos");
    }

    public void ConvertYenToCo(double valor) {
        double YenCoin = valor * 29.68;
        YenCoin = (double) Math.round(YenCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +YenCoin+ " Pesos Colombianos");
    }

    public void ConvertWonToCo(double valor) {
        double WonCoin = valor * 3.04;
        WonCoin = (double) Math.round(WonCoin *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +WonCoin+ " Pesos Colombianos");
    }
}
