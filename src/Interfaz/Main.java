package Interfaz;
import Codigo.Comprador;
import Codigo.*;
import javax.swing.*;

public class Main{
    public static void main(String[] Args) throws Exception {

        Moneda m=new Moneda1500();
        Expendedor expendedor=new Expendedor(1);
        
        PanelComprador n =new PanelComprador();
        PanelExpendedor e1=new PanelExpendedor();
        PanelPrincipal p =new PanelPrincipal(n,e1);

        int seleccion=e1.getSeleccion();

















    }

}
