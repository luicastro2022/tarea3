package Interfaz;
import java.awt.*;
import javax.swing.*;

/**
 * Clase que contiene a todos los otros paneles
 * c= panel Compraador
 * e= panel Expendedor
 */

public class PanelPrincipal extends JFrame{
    private PanelComprador c;
    private PanelExpendedor e;

    public PanelPrincipal(PanelComprador c,PanelExpendedor e){
        super();
        this.c=c;
        this.e=e;

        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        this.add(e,BorderLayout.EAST);
        this.add(c,BorderLayout.WEST);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);


    }
}