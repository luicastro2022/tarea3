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

        JButton cocacola = new JButton("CocaCola");
        this.add(cocacola);
        cocacola.addMouseListener(new EscucharCocacola());


        JButton sprite = new JButton("Sprite");
        this.add(sprite);
        sprite.addMouseListener(new EscucharSprite());

        JButton fanta = new JButton("Fanta");
        this.add(fanta);
        fanta.addMouseListener(new EscucharFanta());

        JButton snicker = new JButton("Snicker");
        this.add(snicker);
        snicker.addMouseListener(new EscucharSnicker());

        JButton super8 = new JButton("Super 8");
        this.add(super8);
        super8.addMouseListener(new EscucharSuper8());


        this.setSize(800, 600);
    }

    public int getSeleccion() {
        return seleccion;
    }
}