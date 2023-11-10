package Interfaz;
import Codigo.*;
import javax.swing.*;
import java.awt.*;
public class PanelDepositos extends JPanel {

    PanelExpendedor e;
    public PanelDepositos(PanelExpendedor e){
        super();
        this.e=e;
        this.setLayout(new GridLayout(5,4));



    }





    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,60,45,70);
        }

        g.setColor(Color.GREEN);
        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,180,45,70);
        }

        g.setColor(Color.ORANGE);
        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,300,45,70);
        }

        g.setColor(Color.YELLOW);
        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,420,55,45);
        }

        g.setColor(Color.RED);
        for(int i=0;i<e.getNumprodcoca();i++){
            int offset=60*i;
            g.fillRect(280+offset,540,55,45);
        }
    }
}
