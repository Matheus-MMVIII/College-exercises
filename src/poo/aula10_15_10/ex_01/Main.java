package poo.aula10_15_10.ex_01;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Calculadora de IMC");

            JLabel weight = new JLabel("Peso (kg):");
            JTextField weightField = new JTextField(15);

            JLabel height = new JLabel("Altura (m):");
            JTextField heightField = new JTextField(15);

            JButton calculate = new JButton("Calcular");
            JButton clean = new JButton("Limpar");

            JLabel imcText = new JLabel("IMC: ");
            JLabel classificationText = new JLabel("Classificação: ");

            JPanel panel = new JPanel(new BorderLayout(10, 15));
            panel.setBorder(new EmptyBorder(20, 20, 20, 20));

            JPanel fieldsPanel = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(6, 6, 6, 6);

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.LINE_END;
            fieldsPanel.add(weight, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(weightField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            fieldsPanel.add(height, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(heightField, gbc);

            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

            buttonsPanel.add(calculate);
            buttonsPanel.add(clean);

            JPanel resultsPanel = new JPanel(new GridLayout(2, 1, 5, 5));

            resultsPanel.add(imcText);
            resultsPanel.add(classificationText);

            calculate.addActionListener(event -> {
                try {
                    double weightValue = Double.parseDouble(weightField.getText().trim().replace(",", "."));

                    double heightValue = Double.parseDouble(heightField.getText().trim().replace(",", "."));

                    if (!Double.isFinite(weightValue)
                            || !Double.isFinite(heightValue)
                            || weightValue <= 0
                            || heightValue <= 0) {

                        JOptionPane.showMessageDialog(window, "Peso e altura devem ser números maiores que zero.");
                        return;
                    }

                    double imc = weightValue / Math.pow(heightValue, 2);

                    imcText.setText(String.format("IMC: %.2f", imc));

                    if (imc < 18.5) {
                        classificationText.setText("Classificação: Abaixo do peso");
                    } else if (imc < 25) {
                        classificationText.setText("Classificação: Normal");
                    } else if (imc < 30) {
                        classificationText.setText("Classificação: Sobrepeso");
                    } else {
                        classificationText.setText("Classificação: Obesidade");
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(window, "Digite valores numéricos válidos.");
                }
            });

            clean.addActionListener(event -> {
                weightField.setText("");
                heightField.setText("");
                imcText.setText("IMC: ");
                classificationText.setText("Classificação: ");

                weightField.requestFocusInWindow();
            });

            panel.add(fieldsPanel, BorderLayout.NORTH);
            panel.add(resultsPanel, BorderLayout.CENTER);
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