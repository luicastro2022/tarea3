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
    private PanelDepositos d;

    public PanelPrincipal(PanelComprador c,PanelExpendedor e, PanelMoneda m, PanelDepositos d){
        super();
        this.c=c;
        this.e=e;
        this.m=m;
        this.d=d;

        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        this.add(e,BorderLayout.EAST);
        this.add(c,BorderLayout.SOUTH);
        this.add(m,BorderLayout.WEST);
        this.add(d,BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);


    }
}