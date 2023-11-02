package Interfaz;

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

    public PanelComprador(){
        super();
        this.setLayout(new GridLayout(1,2));


        JButton comprar = new JButton("comprar");
        this.add(comprar);
        comprar.addMouseListener(new escucharmouse());

        JButton Vuelto = new JButton("Sacar vuelto");
        this.add(Vuelto);
        Vuelto.addMouseListener(new escucharmouse());
    }

    private class escucharmouse implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {


        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
