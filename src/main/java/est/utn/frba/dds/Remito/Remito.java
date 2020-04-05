package est.utn.frba.dds.Remito;

import est.utn.frba.dds.OperacionEgreso.OperacionEgreso;


public class Remito {
    public int totalRemitos = 0;

    private OperacionEgreso opAsociada;
    private int identificador;
    private double valor;

    public Remito(OperacionEgreso _opAsociada){
        opAsociada = _opAsociada;
        identificador = totalRemitos + 1;
        valor = _opAsociada.obtenerPrecio();
        totalRemitos+=1;
    }

}
