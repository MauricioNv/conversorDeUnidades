import javax.swing.*;

public class Function {
    ConversorMonedas monedas = new ConversorMonedas();

    public void ConvertirMonedas(double ValorRecibido){
        String opciones = JOptionPane.showInputDialog(null,
                "seleccione un par", "Monedas",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Clp/Usd", "Clp/Euro","Clp/Soles" , "Usd/Clp","Euro/Clp","Sol/Clp"}, "Seleccion").toString();

        switch (opciones){
            case  "Clp/Usd" :
                monedas.ConversorClpaUsd(ValorRecibido);
                break;
            case "Clp/Euro" :
                monedas.ConversorClpaEuro(ValorRecibido);
                break;
            case "Clp/Soles" :
                monedas.ConversorClpaSoles(ValorRecibido);
                break;
            case "Usd/Clp":
                monedas.ConversorUsdaClp(ValorRecibido);
                break;
            case "Euro/Clp":
                monedas.ConversorEuroaCLP(ValorRecibido);
                break;
            case "Sol/Clp":
                monedas.ConversorSolesaClp(ValorRecibido);
                break;

            }
    }

    // funcion de transformacion de temperaturas

    ConversorTemperaturas temperaturas = new ConversorTemperaturas();

    public void ConvertirTemperaturas(double ValorRecibido){
        String opciones = JOptionPane.showInputDialog(null,
                "seleccione la unidad de temperatura", "unidades",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Celsius/ Kelvin", "Kelvin/Celsius"}, "Seleccion").toString();

        switch (opciones){
            case  "Celsius/ Kelvin" :
                temperaturas.ConversorCelsiusKelvin(ValorRecibido);
                break;
            case "Kelvin/Celsius" :
                temperaturas.ConversorKelvinCelcius(ValorRecibido);
                break;
            case "Clp/Soles" :
                monedas.ConversorClpaSoles(ValorRecibido);
                break;
        }
    }
}
