package Interfaz;
import Codigo.Comprador;
import Codigo.Expendedor;
import Codigo.Moneda;
import Codigo.Moneda1500;

import javax.swing.*;

public class Main{
    public static void main(String[] Args) throws Exception {
        int a=0;
        PanelComprador n =new PanelComprador();
        PanelExpendedor e1=new PanelExpendedor();
        PanelPrincipal p =new PanelPrincipal(n,e1);

        Moneda m = new Moneda1500();
        Moneda m1 = new Moneda1500();
        Expendedor e = new Expendedor(1);

        Comprador d = new Comprador(m, e1.getSeleccion(), e);
        








    }

}
