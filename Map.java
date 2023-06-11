import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.FilenameFilter;

public class Map extends JFrame {
    private JLabel imageLabel;

    public Map() {
        setTitle("(!) WORLD MAP (!)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                loadImageFromDirectory("C:\\Users\\samue\\bug\\RPG_Dimmy");
            }
        });
    }

    private void loadImageFromDirectory(String directoryPath) {
        int labelWidth = imageLabel.getWidth();
        int labelHeight = imageLabel.getHeight();

        if (labelWidth > 0 && labelHeight > 0) {
            File directory = new File(directoryPath);
            File[] imageFiles = directory.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    String extension = name.substring(name.lastIndexOf('.') + 1);
                    return extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png");
                }
            });

            if (imageFiles != null && imageFiles.length > 0) {
                File selectedFile = imageFiles[0];

                ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(scaledImage);
                imageLabel.setIcon(imageIcon);
            } else {
                imageLabel.setText("No image found in the directory");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Map imageViewer = new Map();
            imageViewer.setVisible(true);
        });
    }
}