package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Codigo.*;
public class PanelMoneda extends JPanel{
    int seleccion=1;

    public PanelMoneda(){
        super();
        this.setLayout(new GridLayout(2, 2));
        JTextField opcionmoneda=new JTextField(" ");

        JButton pesos100 = new JButton("");
        this.add(pesos100);
        pesos100.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=1;
                opcionmoneda.setText("100 pesos");
            }
        });

    }

    }

