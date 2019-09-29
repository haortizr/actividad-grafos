package actividad.fabricas.variables.busquedas;

public class BFS implements IBusqueda {

    public BFS() {
        this.nombre = "BFS";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public IBusqueda seleccionarBusqueda() {
        return new BFS();
    }

    @Override
    public String geTipoBusqueda() {
        return this.nombre;
    }
}
