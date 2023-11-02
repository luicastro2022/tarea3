package Interfaz;

import javax.swing.*;

public class Main{
    public static void main(String[] Args){
        PanelComprador n =new PanelComprador();
        PanelExpendedor e=new PanelExpendedor();
        PanelPrincipal p =new PanelPrincipal(n,e);


    }

}
