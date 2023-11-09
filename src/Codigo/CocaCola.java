package Codigo;

class CocaCola extends Bebida{

    public CocaCola(int numSerie){
        super(numSerie);
    }

    /**
     *
     * @return devuelve el precio que recupera de la clase Precios
     */
    public int getprecio() {return Precios.PrecioCoca.getPrecio();}

    /**
     *
     * @return devuelve el string identificador del producto
     */
    @Override
    public String sonido() {
        return "cocacola";
    }
}