import java.awt.Container;
import java.awt.GridLayout;
import java.io.CharConversionException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Conversor {
    public static void criarTela() {
        JFrame tela = new JFrame("Conversor de Temperaturas");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton convertFahrenheitButton = new JButton("Converter Fahrenheit");
        JLabel resultFahrenheitLabel = new JLabel(""); //resultado ainda não existe
        JButton convertKelviButton = new JButton("Converte Kelvin");
        JLabel resultKelvinLabel = new JLabel("");

        Container painel = tela.getContentPane();
        painel.setLayout(new GridLayout(3, 2, 4, 4));
        painel.add(celsiusTextField);
        painel.add(celsiusLabel);
        painel.add(convertFahrenheitButton);
        painel.add(resultFahrenheitLabel);
        painel.add(convertKelviButton);
        painel.add(resultKelvinLabel);

        convertFahrenheitButton.addActionListener((e) -> {
            double celcius = Double.parseDouble(
                celsiusTextField.getText()
            );
            double fahrenheit = 9.0/5.0 * celcius + 32;
            resultFahrenheitLabel.setText(String.format("%.2f \u00B0F", fahrenheit));
        });
        convertKelviButton.addActionListener((e) -> {
            double celcius = Double.parseDouble(
                celsiusTextField.getText()
            );
            double kelvin = celcius + 273.15;
            resultKelvinLabel.setText(String.format("%.2f \u00B0K", kelvin));
        });

        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {criarTela();});
    }
}
