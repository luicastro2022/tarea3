package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class PanelExpendedor extends JPanel implements MouseListener{

    public PanelExpendedor(){
        super();
        this.setLayout(new GridLayout(3,2));

        JButton cocacola=new JButton("CocaCola");
        this.add(cocacola);
        JButton snicker=new JButton("Snicker");
        this.add(snicker);
        JButton sprite=new JButton("Sprite");
        this.add(sprite);
        JButton super8=new JButton("Super 8");
        this.add(super8);
        JButton fanta=new JButton("Fanta");
        this.add(fanta);

        this.addMouseListener(escuchar);

        this.setSize(800,600);
        this.setVisible(true);
    }

    private MouseListener escuchar=new MouseListener() {
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
