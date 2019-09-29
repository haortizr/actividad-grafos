package actividad.fabricas.grafos.factories;

import actividad.fabricas.fijos.Arco;
import actividad.fabricas.fijos.IComponentes;
import actividad.fabricas.fijos.Nodo;

public class FactoryComponentes {
    public IComponentes crearComponente(String tipo){
        IComponentes componente = null;
        if(tipo.equalsIgnoreCase("nodo")){
            componente = new Nodo().crearComponente();
        } else if (tipo.equalsIgnoreCase("arco")) {
            componente = new Arco().crearComponente();
        }
        return componente;
    }
}
