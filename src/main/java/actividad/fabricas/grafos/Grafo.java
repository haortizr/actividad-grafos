package actividad.fabricas.grafos;

import actividad.fabricas.fijos.IComponentes;
import actividad.fabricas.variables.busquedas.IBusqueda;
import actividad.fabricas.variables.direccion.IDireccion;
import actividad.fabricas.variables.peso.IPeso;

import java.util.ArrayList;

public class Grafo {

    FactoryGrafos factoryGrafos;
    String nombre;
    ArrayList<IComponentes> nodosList = new ArrayList<IComponentes>();
    ArrayList<IComponentes> arcosList = new ArrayList<IComponentes>();
    IPeso peso;
    IBusqueda algoritmoBusqueda;
    IDireccion direccion;

    public Grafo() {
        this.factoryGrafos = new FactoryGrafos();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<IComponentes> getNodosList() {
        return nodosList;
    }

    public void setNodosList(ArrayList<IComponentes> nodosList) {
        this.nodosList = nodosList;
    }

    public ArrayList<IComponentes> getArcosList() {
        return arcosList;
    }

    public void setArcosList(ArrayList<IComponentes> arcosList) {
        this.arcosList = arcosList;
    }

    public IPeso getPeso() {
        return peso;
    }

    public void setPeso(IPeso peso) {
        this.peso = peso;
    }

    public IBusqueda getAlgoritmoBusqueda() {
        return algoritmoBusqueda;
    }

    public void setAlgoritmoBusqueda(IBusqueda algoritmoBusqueda) {
        this.algoritmoBusqueda = algoritmoBusqueda;
    }

    public void agregarNodo() {

        nodosList.add(factoryGrafos.crearComponente("nodo"));
    }

    public void agregarArco() {
        arcosList.add(factoryGrafos.crearComponente("arco"));
    }

    public IDireccion getDireccion() {
        return direccion;
    }

    public void setDireccion(IDireccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Grafo{" +
                "nombre='" + nombre + '\'' +
                ", No Nodos ="+nodosList.size()+
                ", No Arcos =" + arcosList.size()+
                ", peso=" + peso.getTipoPeso()+
                ", algoritmoBusqueda=" + algoritmoBusqueda.geTipoBusqueda()+
                ", direccion =" + direccion.geTipoDireccion()+
                '}';
    }
}
