package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import Codigo.*;

/**
 * Panel que representa las Monedas en la Interfaz
 * Contiene 4 botones de selección exclusiva para comprar en el Expendedor
 */
public class PanelMoneda extends JPanel {


    public PanelMoneda() {
        super();
        this.setLayout(new GridLayout(2, 2));

        JRadioButton moneda100= createRadioButton("100pesos.png", "100");
        JRadioButton moneda500= createRadioButton("500pesos.png", "500");
        JRadioButton moneda1000= createRadioButton("1000pesos.jpg", "1000");
        JRadioButton moneda1500= createRadioButton("1500pesos.jpg", "1500");
        ButtonGroup grupo= new ButtonGroup();
        this.add(moneda100);
        this.add(moneda500);
        this.add(moneda1000);
        this.add(moneda1500);
        grupo.add(moneda100);
        grupo.add(moneda500);
        grupo.add(moneda1000);
        grupo.add(moneda1500);

    }

    protected static ImageIcon createImageIcon(String path) {
        try {
            File imgFile = new File(path);
            if (imgFile.exists()) {
                ImageIcon imageIcon = new ImageIcon(path);
                Image image = imageIcon.getImage();
                Image scaledImage = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
                return new ImageIcon(scaledImage);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private static JRadioButton createRadioButton(String imagePath, String text) {
        JRadioButton radioButton = new JRadioButton(text);
        ImageIcon icon = createImageIcon(imagePath);
        if (icon != null) {
            JLabel imageLabel = new JLabel(icon);
            radioButton.setLayout(new FlowLayout());
            radioButton.add(imageLabel);
        }
        return radioButton;
    }
}

