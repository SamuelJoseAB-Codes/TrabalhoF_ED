import javax.swing.*;
import java.awt.*;

//Mostra O Mapa-Múndi em uma Aba
public class Map extends JFrame {
    public Map() {
        setTitle("Exibindo Imagem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/Mapa.jpg")); // Caminho da imagem do Mapa.jpg

        JLabel label = new JLabel();
        label.setIcon(icon);

        getContentPane().add(label, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }

}