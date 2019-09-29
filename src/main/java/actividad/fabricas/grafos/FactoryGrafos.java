package actividad.fabricas.grafos;

import actividad.fabricas.fijos.IComponentes;
import actividad.fabricas.grafos.factories.FactoryBusquedas;
import actividad.fabricas.grafos.factories.FactoryComponentes;
import actividad.fabricas.grafos.factories.FactoryDireccion;
import actividad.fabricas.grafos.factories.FactoryPesos;
import actividad.fabricas.variables.busquedas.IBusqueda;
import actividad.fabricas.variables.direccion.IDireccion;
import actividad.fabricas.variables.peso.IPeso;

import javax.swing.*;

public class FactoryGrafos {

    public Grafo nuevoGrafo() {
        return new Grafo();
    }

    public IComponentes crearComponente(String tipoComponente) {
        FactoryComponentes factoryComponentes = new FactoryComponentes();
        return factoryComponentes.crearComponente(tipoComponente);
    }

    public IBusqueda seleccionarBusqueda(String tipoBusqueda) {
        FactoryBusquedas factoryBusquedas = new FactoryBusquedas();
        return factoryBusquedas.seleccionarBusqueda(tipoBusqueda);
    }


    public IPeso seleccionarPeso(String tipoPeso) {
        FactoryPesos factoryPesos = new FactoryPesos();
        return factoryPesos.seleccionarPeso(tipoPeso);
    }

    public IDireccion seleccionarDireccion(String tipoDireccion) {
        FactoryDireccion factoryDireccion = new FactoryDireccion();
        return factoryDireccion.seleccionarDireccion(tipoDireccion);
    }

}
