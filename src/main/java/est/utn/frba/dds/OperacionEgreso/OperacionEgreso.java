package est.utn.frba.dds.OperacionEgreso;

import est.utn.frba.dds.Item.Item;
import est.utn.frba.dds.Item.TipoItem;
import est.utn.frba.dds.Remito.Remito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionEgreso {
    private boolean abierta;
    private List<Item> items;
    private boolean generaRemito = false;

    public OperacionEgreso(){
        abierta = true;
        items = new ArrayList<Item>();

    }

    public boolean isAbierta(){
        return abierta;
    }

    public void cerrar() throws OperacionCerradaExcepcion {

        if (!abierta) {
            throw new OperacionCerradaExcepcion();

        }
        abierta = false;
        if(condicionRemito()){
            generaRemito = true;
        }
    }

    public void agregarItem(Item item){
        items.add(item);
    }

    public double obtenerPrecio() throws SinItemsExcepcion{
        if(items.isEmpty()){
            throw new SinItemsExcepcion();
        }
        return items.stream().mapToDouble(Item::getPrecio).sum();
    }

    public void retirarItem(Item item){
        items.remove(item);
    } //Siempre va a existir el item porque se va a elegir de una lista de items agregados

    public List<Item> getItems(){
        return items;
    }

    boolean condicionRemito(){
       return items.stream().filter(x -> x.getTipo() == TipoItem.Servicio).collect(Collectors.toList()).isEmpty();
    }

    public boolean generarRemito(){
        return generaRemito;
        //new Remito(this);
    } // por ahora lo hago asi para ver si me viene a la funcion nada mas. Cuando tenga mas
    // cosas sobre los remitos lo genero
}
