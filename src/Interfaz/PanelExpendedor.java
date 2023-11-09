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
    int seleccion=1;

    public PanelExpendedor() {
        super();
        this.setLayout(new GridLayout(3, 2));
        JTextField opcion=new JTextField(" ");


        JButton cocacola = new JButton("CocaCola");
        this.add(cocacola);
        cocacola.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=1;
                opcion.setText("Cocacola");
            }
        });


        JButton sprite = new JButton("Sprite");
        this.add(sprite);
        sprite.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=2;
                opcion.setText("Sprite");
            }
        });

        JButton fanta = new JButton("Fanta");
        this.add(fanta);
        fanta.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=3;
                opcion.setText("Fanta");
            }
        });

        JButton snicker = new JButton("Snicker");
        this.add(snicker);
        snicker.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=4;
                opcion.setText("Snicker");

            }
        });

        JButton super8 = new JButton("Super 8");
        this.add(super8);
        super8.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=5;
                opcion.setText("Super8");
            }
        });


        this.add(opcion);
        this.setSize(800, 600);
    }

    public int getSeleccion() {
        return seleccion;
    }
}