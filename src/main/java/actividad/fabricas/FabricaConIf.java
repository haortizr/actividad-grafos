package actividad.fabricas;

import actividad.fabricas.grafos.FactoryGrafos;
import actividad.fabricas.grafos.Grafo;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class FabricaConIf {



    public static Grafo getGrafo() {

        // obtiene la opción configurada
        String opcion = FabricaConIf.getOpcionConfigurada();

        // crea el objeto de acuerdo a la opción configurada
        FactoryGrafos factoryGrafos = new FactoryGrafos();

        Grafo grafo = factoryGrafos.nuevoGrafo();
        switch (opcion) {

            case "Type1DirigidoType2PesadoDFS":
                grafo.setNombre("Type1DirigidoType2PesadoDFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("DFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("pesado"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("dirigido"));
                break;

            case "Type1DirigidoType2SinPesoDFS":
                grafo.setNombre("Type1DirigidoType2SinPesoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("DFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("sinpeso"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("dirigido"));
                break;

            case "Type1DirigidoType2PesadoBFS":
                grafo.setNombre("Type1DirigidoType2PesadoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("BFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("pesado"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("dirigido"));
                break;
            case "Type1DirigidoType2SinPesoBFS":
                grafo.setNombre("Type1DirigidoType2SinPesoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("BFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("sinpeso"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("dirigido"));
                break;
            case "Type1NoDirigidoType2PesadoDFS":
                grafo.setNombre("Type1NoDirigidoType2PesadoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("DFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("pesado"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("nodirigido"));
                break;
            case "Type1NoDirigidoType2SinPesoDFS":
                grafo.setNombre("Type1NoDirigidoType2SinPesoDFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("DFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("sinpeso"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("nodirigido"));
                break;
            case "Type1NoDirigidoType2PesadoBFS":
                grafo.setNombre("Type1NoDirigidoType2PesadoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("BFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("pesado"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("nodirigido"));
                break;
            case "Type1NoDirigidoType2SinPesoBFS":
                grafo.setNombre("Type1NoDirigidoType2SinPesoBFS");
                grafo.setAlgoritmoBusqueda(factoryGrafos.seleccionarBusqueda("BFS"));
                grafo.setPeso(factoryGrafos.seleccionarPeso("sinpeso"));
                grafo.setDireccion(factoryGrafos.seleccionarDireccion("nodirigido"));
                break;
        }

        return grafo;
    }

    public static String getOpcionConfigurada() {
        // define un valor por defecto
        String opcionConfigurada = "Type1DirigidoType2PesadoDFS";

        try {
            // lee el archivo de configuración
            Properties opciones = new Properties();
            opciones.load(new FileReader("config-if.properties"));

            // revisa las opciones configuradas
            if (opciones.getProperty("Type1DirigidoType2PesadoDFS", "false").equals("true")) {
                opcionConfigurada = "Type1DirigidoType2PesadoDFS";
            }

            if (opciones.getProperty("Type1DirigidoType2SinPesoDFS", "false").equals("true")) {
                opcionConfigurada = "Type1DirigidoType2SinPesoDFS";
            }


            if (opciones.getProperty("Type1DirigidoType2PesadoBFS", "false").equals("true")) {
                opcionConfigurada = "Type1DirigidoType2PesadoBFS";
            }


            if (opciones.getProperty("Type1DirigidoType2SinPesoBFS", "false").equals("true")) {
                opcionConfigurada = "Type1DirigidoType2SinPesoBFS";
            }



            if (opciones.getProperty("Type1NoDirigidoType2PesadoDFS", "false").equals("true")) {
                opcionConfigurada = "Type1NoDirigidoType2PesadoDFS";
            }



            if (opciones.getProperty("Type1NoDirigidoType2SinPesoDFS", "false").equals("true")) {
                opcionConfigurada = "Type1NoDirigidoType2SinPesoDFS";
            }



            if (opciones.getProperty("Type1NoDirigidoType2PesadoBFS", "false").equals("true")) {
                opcionConfigurada = "Type1NoDirigidoType2PesadoBFS";
            }



            if (opciones.getProperty("Type1NoDirigidoType2SinPesoBFS", "false").equals("true")) {
                opcionConfigurada = "Type1NoDirigidoType2SinPesoBFS";
            }


        } catch (Exception e) {
            // ignora cualquier error leyendo el archivo
        }

        return opcionConfigurada;
    }


}
