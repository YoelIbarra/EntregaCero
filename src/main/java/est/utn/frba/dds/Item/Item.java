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

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public TipoItem getTipo() {
        return tipo;
    }


}
