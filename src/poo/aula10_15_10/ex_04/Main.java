package poo.aula10_15_10.ex_04;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Listagem de Produtos");

            JButton list = new JButton("Listar");

            JLabel totalText = new JLabel("Valor total do estoque: R$ 0,00");

            DefaultTableModel model = new DefaultTableModel(
                    new Object[]{"Nome", "Preço", "Quantidade"},
                    0
            ) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            JTable table = new JTable(model);
            table.setFillsViewportHeight(true);

            JScrollPane scrollPane = new JScrollPane(table);

            JPanel panel = new JPanel(new BorderLayout(10, 15));
            panel.setBorder(new EmptyBorder(20, 20, 20, 20));

            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

            buttonsPanel.add(list);

            JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

            totalPanel.add(totalText);

            list.addActionListener(event -> {
                model.setRowCount(0);
                totalText.setText("Valor total do estoque: R$ 0,00");

                Path file = Path.of("produtos.txt");

                if (!Files.exists(file)) {
                    JOptionPane.showMessageDialog(window, "O arquivo produtos.txt ainda não existe.", "Arquivo não encontrado", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                double total = 0;

                try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
                    String line;

                    while ((line = reader.readLine()) != null) {
                        String[] fields = line.split(";", -1);

                        if (fields.length != 3) {
                            continue;
                        }

                        String productName = fields[0].trim();

                        if (productName.isEmpty()) {
                            continue;
                        }

                        try {
                            double price = Double.parseDouble(
                                    fields[1].trim().replace(",", ".")
                            );

                            int quantity = Integer.parseInt(
                                    fields[2].trim()
                            );

                            if (!Double.isFinite(price) || price < 0 || quantity < 0) {
                                continue;
                            }

                            model.addRow(new Object[]{
                                    productName,
                                    String.format(
                                            Locale.forLanguageTag("pt-BR"),
                                            "R$ %.2f",
                                            price
                                    ),
                                    quantity
                            });

                            total += price * quantity;

                        } catch (NumberFormatException e) {
                            // Ignora registros com preço ou quantidade inválidos.
                        }
                    }

                    totalText.setText(String.format(Locale.forLanguageTag("pt-BR"), "Valor total do estoque: R$ %.2f", total));

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(window, "Erro ao ler o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            });

            panel.add(buttonsPanel, BorderLayout.NORTH);
            panel.add(scrollPane, BorderLayout.CENTER);
            panel.add(totalPanel, BorderLayout.SOUTH);

            window.setContentPane(panel);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.pack();
            window.setMinimumSize(new Dimension(500, 300));
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }
}