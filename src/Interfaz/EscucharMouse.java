package Interfaz;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

abstract public class EscucharMouse implements MouseListener {

    int index;
    public void escucharmouse(int index){
        this.index=index;
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
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}

