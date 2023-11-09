package Interfaz;

import Codigo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Panel que representa al comprador en el gui tiene 2 botones
 * Comprar que devuelve el producto comprado (Bebida/Dulce) solo si hay disponibilidad
 * Vuelto que devuelve las monedas correspondientes al vuelto de la compra, si esta fue ejecutada correctamente
 *
 */

public class PanelComprador extends JPanel{
    PanelExpendedor p;

    public PanelComprador(){
        super();
        this.setLayout(new GridLayout(1,2));
        p=new PanelExpendedor();

        JButton comprar = new JButton("Comprar");
        this.add(comprar);
        comprar.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }
        });

        JButton Vuelto = new JButton("Sacar vuelto");
        this.add(Vuelto);
        Vuelto.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
