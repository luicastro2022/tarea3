package Codigo;

public class Comprador{
    private String sonido;
    private int vuelto;

    /**
     *
     * @param m es una moneda de cualquier valor
     * @param cualProducto Ingresar el indice que representa cada producto
     * @param exp una referencia al expendedor correspondiente
     * @throws Exception Maneja las excepciones de casos limites
     */
    public Comprador(Moneda m, int cualProducto, Expendedor exp) throws Exception {
        vuelto = 0;

        if(cualProducto==1 || cualProducto==2 || cualProducto==3) {
            exp.comprarBebida(m,cualProducto);
            Bebida b = exp.getBebida();
            if (b != null) {
                sonido = b.sonido();
            }
            else{
                System.out.println("no se pudo efectuar la compra");
            }
        }
        else if(cualProducto==4 || cualProducto==5){
            exp.comprarDulce(m, cualProducto);
            Dulce d=exp.getDulce();
            if(d!=null){
                sonido = d.sonido();
            }
            else{
                System.out.println("no se pudo efectuar la compra");
            }
        }


        Moneda v = exp.getVuelto();
        while (v != null) {
            vuelto = v.getValor() + vuelto;
            v = exp.getVuelto();
        }

    }







    /**
     *
     * @return devuelve el calculo del vuelto
     */
    public int getvuelto(){return vuelto;}

    /**
     *
     * @return devuelve el sonido correspondiente al producto comprado
     */
    public String getSonidob(){return sonido;}
}