package actividad.fabricas.fijos;

public class Arco implements IComponentes {

    public Arco() {
        this.nombre = "Arco";
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
        return new Arco();
    }
}
