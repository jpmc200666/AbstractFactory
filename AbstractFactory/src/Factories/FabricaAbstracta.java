package Factories;
import Buscadores.Buscador;
import Tiendas.Tiendaapps;
public interface FabricaAbstracta {
    Buscador crearBuscador();
    Tiendaapps crearTiendas();
}
