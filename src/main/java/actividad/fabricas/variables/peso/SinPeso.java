package actividad.fabricas.variables.peso;

public class SinPeso implements IPeso {

    public SinPeso() {
        this.nombre = "SinPeso";
    }

    String nombre;

    public String getNombre() {
        return nombre;
    }

    @Override
    public IPeso seleccionarPeso() {
        return new SinPeso();
    }

    @Override
    public String getTipoPeso() {
        return this.nombre;
    }
}
