import javax.swing.*;

public class ConversorMonedas {

    public void ConversorClpaUsd(double valorRecibido) {
            double monedaUsd = valorRecibido/1000;
            monedaUsd = (double) Math.round(monedaUsd*100d/100);
        JOptionPane.showMessageDialog(null , "tienes $ " + monedaUsd);
    }


    public void ConversorClpaEuro(double valorRecibido) {
        double monedaEuro = valorRecibido/1100;
        monedaEuro = (double) Math.round(monedaEuro*100d/100);
        JOptionPane.showMessageDialog(null , "tienes  " + monedaEuro + "Euros");

    }

    public void ConversorClpaSoles(double valorRecibido) {
        double monedaSoles = valorRecibido/230;
        monedaSoles = (double) Math.round(monedaSoles*100d/100);
        JOptionPane.showMessageDialog(null , "tienes  " + monedaSoles + "Soles");

    }

    public void ConversorUsdaClp(double valorRecibido) {
        double monedaUsd = valorRecibido*1000;
        monedaUsd = (double) Math.round(monedaUsd*100d/100);
        JOptionPane.showMessageDialog(null , "tienes $ " + monedaUsd);
    }


    public void ConversorEuroaCLP(double valorRecibido) {
        double monedaEuro = valorRecibido*1100;
        monedaEuro = (double) Math.round(monedaEuro*100d/100);
        JOptionPane.showMessageDialog(null , "tienes  " + monedaEuro + "Euros");

    }

    public void ConversorSolesaClp(double valorRecibido) {
        double monedaSoles = valorRecibido*230;
        monedaSoles = (double) Math.round(monedaSoles*100d/100);
        JOptionPane.showMessageDialog(null , "tienes  " + monedaSoles + "Soles");

    }
}
