package Interfaz;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EscucharSnicker extends EscucharMouse implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(4);

    }
}