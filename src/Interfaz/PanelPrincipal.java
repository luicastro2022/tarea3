package Interfaz;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JFrame{
    private PanelComprador c;
    public PanelPrincipal(PanelComprador c){
        super();
        this.c=c;
        this.setLayout(new GridLayout(2,2));
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        this.add(c);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);


    }
}