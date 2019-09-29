package actividad.fabricas.grafos.factories;

import actividad.fabricas.variables.direccion.Dirigido;
import actividad.fabricas.variables.direccion.IDireccion;
import actividad.fabricas.variables.direccion.NoDirigido;
import actividad.fabricas.variables.peso.IPeso;
import actividad.fabricas.variables.peso.Pesado;
import actividad.fabricas.variables.peso.SinPeso;

public class FactoryDireccion {
    public IDireccion seleccionarDireccion(String tipo) {
        IDireccion peso = null;
        if (tipo.equalsIgnoreCase("dirigido")) {
            peso = new Dirigido().seleccionarDireccion();
        } else if (tipo.equalsIgnoreCase("nodirigido")) {
            peso = new NoDirigido().seleccionarDireccion();
        }
        return peso;
    }
}
