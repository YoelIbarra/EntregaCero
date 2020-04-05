package est.utn.frba.dds.OperacionEgresoTest;

import est.utn.frba.dds.Item.Item;
import est.utn.frba.dds.Item.TipoItem;
import est.utn.frba.dds.OperacionEgreso.OperacionCerradaExcepcion;
import est.utn.frba.dds.OperacionEgreso.OperacionEgreso;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static est.utn.frba.dds.Item.TipoItem.Servicio;
import static est.utn.frba.dds.Item.TipoItem.Articulo;

public class TestOperacionEgreso {

    private OperacionEgreso operacion;
    private Item item1;
    private Item item2;
    private Item item3;


    @Before
    public void init() {
        this.operacion = new OperacionEgreso();
        this.item1 = new Item("item1", 10, Servicio);
        this.item2 = new Item("item2", 12.2, Articulo);
        this.item3 = new Item("item3", 5.3, Articulo);
    }

    @Test
    public void obtenerPrecio() {

        this.operacion.agregarItem(this.item1);
        this.operacion.agregarItem(this.item2);
        this.operacion.agregarItem(this.item3);

        this.operacion.cerrar();

        Assert.assertEquals(27.5, this.operacion.obtenerPrecio(), 0.1);


    }

    @Test
    public void cerrarOperacion() {

        this.operacion.agregarItem(this.item1);
        this.operacion.cerrar();

        Assert.assertFalse(this.operacion.isAbierta());


    }
    @Test
    public void cerrarOperacionExcepcion() {

        try
        {
            this.operacion.agregarItem(this.item1);
            this.operacion.cerrar();
            this.operacion.cerrar();
        }
        catch(OperacionCerradaExcepcion ex) {}

    }

    @Test
    public void generaRemito(){


        this.operacion.agregarItem(this.item2);
        this.operacion.agregarItem(this.item3);

        this.operacion.cerrar();

        Assert.assertTrue(this.operacion.generarRemito()); //mas adelante este test tiene que
                                                            //decirme si genere el remito


}

}
