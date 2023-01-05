import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        Function monedas = new Function();
        Function temperaturas = new Function();

        String opciones = JOptionPane.showInputDialog(null,
                "seleccione una conversión", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion").toString();
        switch (opciones){
            case  "Conversor de Moneda" :{
                String input =JOptionPane.showInputDialog("ingrese valor");

                double valorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(valorRecibido);
                

                int seleccion =JOptionPane.showConfirmDialog(null, "¿desea realizar otra conversion");

                if ( JOptionPane.OK_OPTION == seleccion){
                    System.out.println("Selecciona opcion afirmativa");
                    
               } else {
                    JOptionPane.showMessageDialog(null, "programa terminado");
                }
                break;
            }
            case  "Conversor de Temperatura" :{
                String input =JOptionPane.showInputDialog("ingrese valor");
                double valorRecibido = Double.parseDouble(input);
                temperaturas.ConvertirTemperaturas(valorRecibido);

                int seleccion =JOptionPane.showConfirmDialog(null, "¿desea realizar otra conversion");
                if ( JOptionPane.OK_OPTION == seleccion){
                    System.out.println("Selecciona opcion afirmativa");
                } else {
                    JOptionPane.showMessageDialog(null, "programa terminado");
                }
                break;
            }
        }
    }
}