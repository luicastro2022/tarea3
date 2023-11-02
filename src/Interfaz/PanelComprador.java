package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
            System.out.println("press");

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
