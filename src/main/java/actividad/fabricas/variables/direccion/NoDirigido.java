package actividad.fabricas.variables.direccion;

public class NoDirigido implements IDireccion {
    public NoDirigido() {
        this.nombre = "NoDirigido";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public IDireccion seleccionarDireccion() {
        return new NoDirigido();
    }

    @Override
    public String geTipoDireccion() {
        return this.nombre;
    }
}
