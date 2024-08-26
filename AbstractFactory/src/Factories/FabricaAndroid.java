package Factories;
import Buscadores.Androidbuscador;
import Buscadores.Buscador;
import Tiendas.Androidtienda;
import Tiendas.Tiendaapps;
public class FabricaAndroid implements FabricaAbstracta{
    @Override
    public Buscador crearBuscador(){
        return new Androidbuscador();
    }
    @Override
    public Tiendaapps crearTiendas(){
        return new Androidtienda();
    }
}
