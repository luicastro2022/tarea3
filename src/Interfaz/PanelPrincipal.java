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
    private PanelMoneda m;

    public PanelPrincipal(PanelComprador c,PanelExpendedor e, PanelMoneda m){
        super();
        this.c=c;
        this.e=e;
        this.m=m;

        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        this.add(e,BorderLayout.EAST);
        this.add(c,BorderLayout.SOUTH);
        this.add(m,BorderLayout.WEST);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);


    }
}