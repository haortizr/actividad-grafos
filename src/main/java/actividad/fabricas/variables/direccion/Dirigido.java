package actividad.fabricas.variables.direccion;

public class Dirigido implements IDireccion {

    public Dirigido() {
        this.nombre = "Dirigido";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public IDireccion seleccionarDireccion() {
        return new Dirigido();
    }

    @Override
    public String geTipoDireccion() {
        return this.nombre;
    }
}
