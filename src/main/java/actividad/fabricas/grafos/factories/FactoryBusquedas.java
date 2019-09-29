package actividad.fabricas.grafos.factories;

import actividad.fabricas.fijos.Arco;
import actividad.fabricas.fijos.IComponentes;
import actividad.fabricas.fijos.Nodo;
import actividad.fabricas.variables.busquedas.BFS;
import actividad.fabricas.variables.busquedas.DFS;
import actividad.fabricas.variables.busquedas.IBusqueda;

public class FactoryBusquedas {
    public IBusqueda seleccionarBusqueda(String tipo){
        IBusqueda busqueda = null;
        if(tipo.equalsIgnoreCase("DFS")){
            busqueda = new DFS().seleccionarBusqueda();
        } else if (tipo.equalsIgnoreCase("BFS")) {
            busqueda = new BFS().seleccionarBusqueda();
        }
        return busqueda;
    }
}
