package Codigo;

/** Dulce marca Snicker*/
public class Snicker extends Dulce{
    /** constructor de Snicker con un numero de serie para identificarlo*/
    public Snicker(int serie){
        super(serie);
    }

    @Override
    public String sonido() {
        return "snicker";
    }

    /** getter para obtener el precio de un snicker*/
    public int getprecio(){return Precios.PrecioSnicker.getPrecio();}
}
