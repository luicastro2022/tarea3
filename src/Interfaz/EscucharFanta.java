package Interfaz;

import Codigo.Comprador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EscucharFanta extends EscucharMouse implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(3);

    }
}