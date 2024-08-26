
import Controlador.Control;
import Factories.FabricaAbstracta;
import Factories.FabricaAndroid;
import Factories.FabricaIos;
public class Launcher {
    private static Control configurarControl(){
        Control control;
        FabricaAbstracta abstractfactory;
        String opName = "Ios";
        if(opName.equals("Android")){
            abstractfactory = new FabricaAndroid();
        }else{
            abstractfactory = new FabricaIos();
        }
        control = new Control(abstractfactory);
        return control;
    }
    public static void main(String[] args) throws Exception {
        Control control = configurarControl();
        control.buscarycomprar();
    }
}
