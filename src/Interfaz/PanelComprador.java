package Interfaz;

import Codigo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Panel que representa al comprador en el gui tiene 2 botones
 * Comprar que devuelve el producto comprado (Bebida/Dulce) solo si hay disponibilidad
 * Vuelto que devuelve las monedas correspondientes al vuelto de la compra, si esta fue ejecutada correctamente
 *
 */

public class PanelComprador extends JPanel{
    PanelDepositos d;

    public PanelComprador(PanelExpendedor p,PanelDepositos d){
        super();
        this.setLayout(new GridLayout(2,2));
        this.d=d;
        JTextField articulo=new JTextField();
        JTextField vuelto =new JTextField();


        JButton sacarProducto = new JButton("Sacar Producto");
        this.add(sacarProducto);
        sacarProducto.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Producto b=p.getseleccion();
                articulo.setText(b.sonido());


            }
        });

        JButton Vuelto = new JButton("Sacar vuelto");
        this.add(Vuelto);
        Vuelto.addMouseListener(new EscucharMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Moneda m=p.getvuelto();



            }
        });

        this.add(articulo);
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
