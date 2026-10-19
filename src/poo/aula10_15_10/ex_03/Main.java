package poo.aula10_15_10.ex_03;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Cadastro de Produtos");

            JLabel name = new JLabel("Nome:");
            JTextField nameField = new JTextField(15);

            JLabel price = new JLabel("Preço (R$):");
            JTextField priceField = new JTextField(15);

            JLabel quantity = new JLabel("Quantidade:");
            JTextField quantityField = new JTextField(15);

            JButton save = new JButton("Salvar");
            JButton clean = new JButton("Limpar");

            JPanel panel = new JPanel(new BorderLayout(10, 15));
            panel.setBorder(new EmptyBorder(20, 20, 20, 20));

            JPanel fieldsPanel = new JPanel(new GridBagLayout());

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(6, 6, 6, 6);

            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.LINE_END;
            fieldsPanel.add(name, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(nameField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            fieldsPanel.add(price, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(priceField, gbc);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            fieldsPanel.add(quantity, gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            fieldsPanel.add(quantityField, gbc);

            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

            buttonsPanel.add(save);
            buttonsPanel.add(clean);

            save.addActionListener(event -> {
                String productName = nameField.getText().trim();
                String priceText = priceField.getText().trim().replace(",", ".");
                String quantityText = quantityField.getText().trim();

                if (productName.isEmpty() || priceText.isEmpty() || quantityText.isEmpty()) {

                    JOptionPane.showMessageDialog(window, "Preencha todos os campos.");
                    return;
                }

                if (productName.contains(";") || productName.contains("\n") || productName.contains("\r")) {

                    JOptionPane.showMessageDialog(window, "O nome do produto não pode conter ';' ou quebras de linha.");
                    return;
                }

                try {
                    double priceValue = Double.parseDouble(priceText);
                    int quantityValue = Integer.parseInt(quantityText);

                    if (!Double.isFinite(priceValue)
                            || priceValue < 0
                            || quantityValue < 0) {

                        JOptionPane.showMessageDialog(window, "O preço e a quantidade não podem ser negativos.");
                        return;
                    }

                    String line = String.format(
                            Locale.US,
                            "%s;%.2f;%d%n",
                            productName,
                            priceValue,
                            quantityValue
                    );

                    Files.writeString(
                            Path.of("produtos.txt"),
                            line,
                            StandardCharsets.UTF_8,
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND
                    );

                    JOptionPane.showMessageDialog(window, "Produto salvo com sucesso.");

                    clearFields(nameField, priceField, quantityField);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(window, "Digite um preço e uma quantidade válidos.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(window, "Erro ao salvar o produto: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            clean.addActionListener(event -> {clearFields(nameField, priceField, quantityField);});

            panel.add(fieldsPanel, BorderLayout.NORTH);
            panel.add(buttonsPanel, BorderLayout.SOUTH);

            window.setContentPane(panel);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.pack();
            window.setMinimumSize(window.getSize());
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }

    private static void clearFields(
            JTextField nameField,
            JTextField priceField,
            JTextField quantityField
    ) {
        nameField.setText("");
        priceField.setText("");
        quantityField.setText("");

        nameField.requestFocusInWindow();
    }
}