package TemperatureConverter;

import javax.swing.JOptionPane;

public class functionTemperature {
    TemperatureConverter temperatura = new TemperatureConverter();

    public void ConverterTemperature(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
            case "Grados Celcius a Grados Farenheit":
                temperatura.ConvertCelciusToFarenheit(Minput);
                break;
            case "Grados Celcius a Kelvin":
                temperatura.ConvertCelciusToKelvin(Minput);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatura.ConvertFarenheitToCelcius(Minput);
                break;
            case "Kelvin a Grados Celcius":
                temperatura.ConvertKelvinToCelcius(Minput);
                break;
            case "Kelvin a Grados Farenheit":
                temperatura.ConvertKelvinToFarenheit(Minput);
                break;
        }
    }
}
