package Interfaz;
import Codigo.Comprador;
import Codigo.*;
import javax.swing.*;

public class Main{
    public static void main(String[] Args) throws Exception {

        Moneda m=new Moneda1500();
        Expendedor expendedor=new Expendedor(4);


        PanelExpendedor e1=new PanelExpendedor();
        PanelMoneda m2= new PanelMoneda();
        PanelDepositos p1= new PanelDepositos();
        int seleccion=e1.getSeleccion();
        Moneda ms= m2.getMs();

        PanelComprador n =new PanelComprador(ms, seleccion, expendedor);
        PanelPrincipal p =new PanelPrincipal(n,e1, m2, p1);

    }

}
