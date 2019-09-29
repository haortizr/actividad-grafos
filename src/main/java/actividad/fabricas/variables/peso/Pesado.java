package actividad.fabricas.variables.peso;

public class Pesado implements IPeso {

    public Pesado() {
        this.nombre = "Pesado";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public IPeso seleccionarPeso() {
        return new Pesado();
    }

    @Override
    public String getTipoPeso() {
        return this.nombre;
    }
}
