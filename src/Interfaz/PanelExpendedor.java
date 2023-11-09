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
    private int seleccion=1;
    private int seleccion2=1;
    private Expendedor e;
    private Moneda ms;

    public PanelExpendedor() {
        super();
        this.setLayout(new GridLayout(3, 4));
        JTextField opcion=new JTextField(" ");
        JTextField opcion2=new JTextField( " ");
        JTextField opcion3=new JTextField(" ");

        e=new Expendedor(4);

        JButton cocacola = new JButton("CocaCola");
        this.add(cocacola);
        cocacola.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=1;
                opcion.setText("Cocacola");
            }
        });


        JButton sprite = new JButton("Sprite");
        this.add(sprite);
        sprite.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=2;
                opcion.setText("Sprite");
            }
        });

        JButton fanta = new JButton("Fanta");
        this.add(fanta);
        fanta.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=3;
                opcion.setText("Fanta");
            }
        });

        JButton snicker = new JButton("Snicker");
        this.add(snicker);
        snicker.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=4;
                opcion.setText("Snicker");

            }
        });

        JButton super8 = new JButton("Super 8");
        this.add(super8);
        super8.addMouseListener(new EscucharMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion=5;
                opcion.setText("Super8");
            }
        });

        this.add(opcion);
        this.add(opcion2);
        this.add(opcion3);

        JButton moneda100= new JButton("100");
        this.add(moneda100);
        moneda100.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion2=1;
                opcion2.setText("100 pesos");
                ms=new Moneda100();
            }
        });

        JButton moneda500=new JButton("500");
        this.add(moneda500);
        moneda500.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion2=2;
                opcion2.setText("500 pesos");
                ms=new Moneda500();
            }
        });

        JButton moneda1000=new JButton("1000");
        this.add(moneda1000);
        moneda1000.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion2=3;
                opcion2.setText("1000 pesos");
                ms=new Moneda1000();
            }
        });

        JButton moneda1500=new JButton("1500");
        this.add(moneda1500);
        moneda1500.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seleccion2=4;
                opcion2.setText("1500 pesos");
                ms=new Moneda1500();
            }
        });

        this.setSize(800, 600);
    }


    public int getSelecceion() {
        return seleccion;
    }

    public Void comprar() throws Exception {
        if(seleccion==1||seleccion==2||seleccion==3){
            e.comprarBebida(ms,seleccion);
        }
        else{
            e.comprarDulce(ms,seleccion);
        }


        return null;
    };

    public Producto getseleccion(){
        if(seleccion==1||seleccion==2||seleccion==3){
            return e.getBebida();
        }
        else{
            return e.getDulce();
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }
}