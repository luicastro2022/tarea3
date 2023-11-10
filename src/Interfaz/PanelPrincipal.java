package Interfaz;
import Codigo.Expendedor;

import java.awt.*;
import javax.swing.*;

/**
 * Clase que contiene a todos los otros paneles
 * c= panel Compraador, es el panel del lado izquierdo y tiene la funcion de "sacar" el producto y el vuelto
 * e= panel Expendedor, es el panel de la derecha y tiene la funcion de seleccionar la bebida y la moneda a usar
 * d= panel de los depositos que se mostraran en pantalla
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
        /**Los metodos de abajo solo añaden los depositos a la ventana principal
         *
         */
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

    }
}