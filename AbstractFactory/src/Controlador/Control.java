package Controlador;
import Buscadores.Buscador;
import Tiendas.Tiendaapps;
import Factories.FabricaAbstracta;
public class Control {
    private Buscador buscador;
    private Tiendaapps tiendaapps;
    public Control(FabricaAbstracta fabrica){
        buscador = fabrica.crearBuscador();
        tiendaapps = fabrica.crearTiendas();
    }
    public void buscarycomprar(){
        buscador.buscar();
        tiendaapps.comprar();
    }
}
