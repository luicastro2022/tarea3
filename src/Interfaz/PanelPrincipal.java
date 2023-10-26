package Interfaz;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JFrame{
    public PanelPrincipal(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        this.setSize(800,600);
        this.setVisible(true);
    }
}