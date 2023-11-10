package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Clase usada para representar los productos en pantalla, cada producto tiene su lista y recibe un PanelExpendedor como parametro
 */
public class PanelDepositos extends JPanel {

    PanelExpendedor e;
    public PanelDepositos(PanelExpendedor e){
        super();
        this.e=e;
        this.setLayout(new GridLayout(5,4));
        this.setBackground(Color.PINK);

    }
    public void paint(Graphics g) {
        super.paint(g);
        revalidate();
        g.setColor(Color.BLACK);
        g.clearRect(270,50,260,600);


        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,60,45,70);
        }

        g.setColor(Color.GREEN);
        for(int i=0;i<e.getNumprodsprite();i++){
            int offset=60*i;
            g.fillRect(280+offset,180,45,70);
        }

        g.setColor(Color.ORANGE);
        for(int i=0;i<e.getNumprodfanta();i++){
            int offset=60*i;
            g.fillRect(280+offset,300,45,70);
        }

        g.setColor(Color.YELLOW);
        for(int i=0;i<e.getNumprodsnicker();i++){
            int offset=60*i;
            g.fillRect(280+offset,420,55,45);
        }

        g.setColor(Color.RED);
        for(int i=0;i<e.getNumprodsuper8();i++){
            int offset=60*i;
            g.fillRect(280+offset,540,55,45);
        }
    }
}
