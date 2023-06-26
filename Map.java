import javax.swing.*;
import java.awt.*;

public class Map extends JFrame {
    public Map() {
        setTitle("Exibindo Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Mapa.jpg")); // substitua "sua_imagem.jpg" pelo nome da sua imagem

        JLabel label = new JLabel();
        label.setIcon(icon);

        getContentPane().add(label, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Map();
            }
        });
    }
}