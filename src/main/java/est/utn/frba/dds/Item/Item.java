package est.utn.frba.dds.Item;

public class Item {
    private String nombre;
    private double precio;
    TipoItem tipo;

    //CONSTRUCTOR
    public Item(String _nombre, double _precio, TipoItem _tipo){
        nombre = _nombre;
        precio = _precio;
        tipo = _tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setPrecio(float _precio){
        precio = _precio;
    }


}
