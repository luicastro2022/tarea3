package Interfaz;
import java.awt.*;
import javax.swing.*;

/**
 * Clase que contiene a todos los otros paneles
 * c= panel Compraador
 * e= panel Expendedor
 */

public class PanelPrincipal extends JFrame{
    private PanelComprador c;
    private PanelExpendedor e;

    public PanelPrincipal(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Ventana Principal");
        this.getContentPane().setBackground(Color.CYAN);

        c=new PanelComprador();
        e=new PanelExpendedor();


        this.add(e,BorderLayout.EAST);
        this.add(c,BorderLayout.WEST);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setVisible(true);


    }
}