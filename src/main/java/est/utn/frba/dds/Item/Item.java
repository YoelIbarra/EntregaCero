package est.utn.frba.dds.Item;

public class Item {
    private String nombre;
    private float precio;
    TipoItem tipo;

    //CONSTRUCTOR
    public Item(String _nombre, float _precio, TipoItem _tipo){
        nombre = _nombre;
        precio = _precio;
        tipo = _tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setPrecio(float _precio){
        precio = _precio;
    }


}
