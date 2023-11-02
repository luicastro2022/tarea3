package Interfaz;
import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JFrame{
    private PanelComprador n;
    public PanelPrincipal(PanelComprador n){
        super();
        this.n=n;
        this.setLayout(new GridLayout(2,2));
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        
        this.add(n);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);


    }
}