package Factories;

import Buscadores.Iosbuscador;
import Buscadores.Buscador;
import Tiendas.Iostienda;
import Tiendas.Tiendaapps;

public class FabricaIos implements FabricaAbstracta{
    @Override
    public Buscador crearBuscador(){
        return new Iosbuscador();
    }
    @Override
    public Tiendaapps crearTiendas(){
        return new Iostienda();
    }
}
