package actividad.fabricas;

import actividad.fabricas.grafos.Grafo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Aplicacion {

    public static void main(String[] args) {





        Grafo grafo = FabricaConIf.getGrafo();
        grafo.agregarArco();
        grafo.agregarNodo();
        grafo.agregarArco();
        grafo.agregarNodo();


        System.out.println(grafo.toString());

    }
}
