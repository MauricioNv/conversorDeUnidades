import javax.swing.*;

public class ConversorTemperaturas {
    public void ConversorCelsiusKelvin(double valorRecibido) {
        double Kelvin = valorRecibido + 273.15 ;
        JOptionPane.showMessageDialog(null , "tienes  " + Kelvin + "°K");
    }


    public void ConversorKelvinCelcius(double valorRecibido) {
        double Celsius = valorRecibido -273.15;
        JOptionPane.showMessageDialog(null , "tienes  " + Celsius + "°C");

    }

}

