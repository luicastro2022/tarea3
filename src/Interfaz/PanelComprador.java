package Interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel{
    public PanelComprador(){
        super();
        this.setLayout(new GridLayout(1,2));
        this.setSize(10,10);

        JButton comprar =new JButton("comprar");
        this.add(comprar);

        this.add(new JButton("Sacar moneda"));


    }
}
