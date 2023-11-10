package Interfaz;
import Codigo.Expendedor;

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
    private PanelDepositos d;




    public PanelPrincipal(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.PINK);


        e=new PanelExpendedor();
        c=new PanelComprador(e,d);
        d=new PanelDepositos(e);

        this.add(e,BorderLayout.EAST);
        this.add(c,BorderLayout.WEST);
        this.add(d,BorderLayout.CENTER);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        c.paint(g);
        e.paint(g);
        d.paint(g);
        d.paint(g);
    }
}