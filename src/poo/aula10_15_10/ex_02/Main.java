package poo.aula10_15_10.ex_02;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Locale;

public class Main {

    private static final double COTACAO_DOLAR = 5.50;
    private static final double COTACAO_EURO = 6.00;
    private static final double COTACAO_LIBRA = 7.00;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Conversor de Moedas");

            JLabel value = new JLabel("Valor em reais (R$):");
            JTextField valueField = new JTextField(15);

            JLabel currency = new JLabel("Moeda de destino:");
            JComboBox<String> currencyCombo = new JComboBox<>(new String[]{"Dólar (USD)", "Euro (EUR)", "Libra (GBP)"});

            JButton convert = new JButton("Converter");

            JLabel resultText = new JLabel("Valor convertido: ");

            JPanel panel = new JPanel(new BorderLayout(10, 15));
            panel.setBorder(new EmptyBorder(20, 20, 20, 20));

            JPanel fieldsPanel = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(6, 6, 6, 6);

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.LINE_END;
            fieldsPanel.add(value, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(valueField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            fieldsPanel.add(currency, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(currencyCombo, gbc);

            JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

            resultPanel.add(resultText);

            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

            buttonsPanel.add(convert);

            convert.addActionListener(event -> {
                try {
                    double valueInReais = Double.parseDouble(
                            valueField.getText().trim().replace(",", ".")
                    );

                    if (!Double.isFinite(valueInReais) || valueInReais < 0) {
                        JOptionPane.showMessageDialog(window, "Digite um valor válido, maior ou igual a zero.");
                        return;
                    }

                    double cotacao;
                    String symbol;

                    if (currencyCombo.getSelectedIndex() == 0) {
                        cotacao = COTACAO_DOLAR;
                        symbol = "US$";
                    } else if (currencyCombo.getSelectedIndex() == 1) {
                        cotacao = COTACAO_EURO;
                        symbol = "€";
                    } else {
                        cotacao = COTACAO_LIBRA;
                        symbol = "£";
                    }

                    double convertedValue = valueInReais / cotacao;

                    resultText.setText(String.format(
                            Locale.forLanguageTag("pt-BR"),
                            "Valor convertido: %s %.2f",
                            symbol,
                            convertedValue
                    ));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(window, "Digite um valor numérico válido.");
                }
            });

            panel.add(fieldsPanel, BorderLayout.NORTH);
            panel.add(resultPanel, BorderLayout.CENTER);
            panel.add(buttonsPanel, BorderLayout.SOUTH);

            window.setContentPane(panel);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.pack();
            window.setMinimumSize(window.getSize());
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }
}