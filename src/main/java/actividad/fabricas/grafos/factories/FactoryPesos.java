package actividad.fabricas.grafos.factories;

import actividad.fabricas.fijos.Arco;
import actividad.fabricas.fijos.IComponentes;
import actividad.fabricas.fijos.Nodo;
import actividad.fabricas.variables.peso.IPeso;
import actividad.fabricas.variables.peso.Pesado;
import actividad.fabricas.variables.peso.SinPeso;

public class FactoryPesos {
    public IPeso seleccionarPeso(String tipo) {
        IPeso peso = null;
        if (tipo.equalsIgnoreCase("pesado")) {
            peso = new Pesado().seleccionarPeso();
        } else if (tipo.equalsIgnoreCase("sinpeso")) {
            peso = new SinPeso().seleccionarPeso();
        }
        return peso;
    }
}
