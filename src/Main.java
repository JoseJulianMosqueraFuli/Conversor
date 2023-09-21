import javax.swing.JOptionPane;

import CurrencyConverter.function;
import TemperatureConverter.functionTemperature;
public class Main {

    public static void main (String[] args) {

        function coins = new function();
        functionTemperature temperatura = new functionTemperature();

        while(true) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch(opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if(NumberValidator(input) == true) {
                        double Minput = Double.parseDouble(input);
                        coins.ConverterCoins(Minput);

                        int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Selecciona opción Afirmativa");
                        }else{
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;


                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(NumberValidator(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConverterTemperature(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if((respuesta == 0) && (NumberValidator(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
            }
        }

    }
    public static boolean NumberValidator(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
