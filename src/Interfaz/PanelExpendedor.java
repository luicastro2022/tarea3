package Interfaz;

import Codigo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Panel que representa al Expendedor en la interfaz
 * Contiene 5 Botones que representan los productos
 * El ultimo espacio del grid esta reservado para mostrar la seleccion actual
 */

public class PanelExpendedor extends JPanel{

    int seleccion;
    public PanelExpendedor() {
        super();
        this.setLayout(new GridLayout(3, 2));

        JButton cocacola = new JButton("CocaCola");
        this.add(cocacola);
        cocacola.addMouseListener(new escucharmouse());

        JButton snicker = new JButton("Snicker");
        this.add(snicker);

        JButton sprite = new JButton("Sprite");
        this.add(sprite);

        JButton super8 = new JButton("Super 8");
        this.add(super8);

        JButton fanta = new JButton("Fanta");
        this.add(fanta);


        this.setSize(800, 600);

    }

    private class escucharmouse implements MouseListener{
        public void escucharmouse(String nombre){

        }
        @Override
        public void mouseClicked(MouseEvent e) {
            seleccion=1;

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public int getSeleccion(){
        return seleccion;
    }
}