import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumberGenerator extends JFrame {
    private JLabel numberLabel;
    private JButton generateButton;
    private Random random;

    public RandomNumberGenerator() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Gerador de Número Aleatório");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Inicializa o gerador de números aleatórios
        random = new Random();

        // Label para exibir o número
        numberLabel = new JLabel("Clique no botão para gerar um número.");
        numberLabel.setFont("Arial", Font.PLAIN, 16);
        numberLabel.setPreferredSize(new Dimension(280, 30));

        // Botão para gerar o número
        generateButton = new JButton("Gerar Número");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomNumber();
            }
        });

        add(numberLabel);
        add(generateButton);
    }

    private void generateRandomNumber() {
        // Gera um número aleatório entre 1 e 11
        int randomNumber = random.nextInt(11) + 1;
        numberLabel.setText("Número gerado: " + randomNumber);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RandomNumberGenerator().setVisible(true);
            }
        });
    }
}
