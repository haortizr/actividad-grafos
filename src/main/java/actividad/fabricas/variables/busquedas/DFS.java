package actividad.fabricas.variables.busquedas;

public class DFS implements IBusqueda {
    public DFS() {
        this.nombre = "DFS";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public IBusqueda seleccionarBusqueda() {
        return new DFS();
    }

    @Override
    public String geTipoBusqueda() {
        return this.nombre;
    }
}
