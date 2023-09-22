package TemperatureConverter;

import javax.swing.JOptionPane;

public class TemperatureConverter {

    public double ConvertCelciusToFarenheit(double valor) {
        double farenheit = valor * 1.8 + 32;
        farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
        return farenheit;
    }

    public void ConvertCelciusToKelvin(double valor){
        double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
    }

    public void ConvertFarenheitToCelcius(double valor) {
        double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
    }

    public double ConvertKelvinToCelcius(double valor) {
        double kelvinCelcius = valor - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
    }

    public void ConvertKelvinToFarenheit(double valor) {
        double kelvinFarenheit = ConvertKelvinToCelcius(valor);
        kelvinFarenheit = ConvertCelciusToFarenheit(kelvinFarenheit);
        kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
    }

}
