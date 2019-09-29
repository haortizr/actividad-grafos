package actividad.fabricas.fijos;

public class Nodo implements IComponentes {

    public Nodo() {
        this.nombre = "Nodo";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public IComponentes crearComponente() {
        return new Nodo();
    }
}
