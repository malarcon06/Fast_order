import java.util.ArrayList;
import java.util.List;

public class Local {
    private static int numeroMesas;
    private static String nombre;
    private static List<Mesas> mesasList;
    public Local(String nombre){
        Local.numeroMesas = 0;
        Local.nombre = nombre;
        Local.mesasList = new ArrayList<Mesas>();
    }
    private static int getNumeroMesas(){
        return Local.numeroMesas;
    }
    public void anadirMesas(int capacidad){
        Local.numeroMesas++;
        Local.mesasList.add(new Mesas(capacidad, Local.numeroMesas));
    }
    public void eliminarMesa(int numeroMesa){
        Local.numeroMesas--;
        Local.mesasList.remove(numeroMesa);
        reasignarNumeroMesas();
    }
    private void reasignarNumeroMesas(){
        int count = 0;
        for(Mesas mesa: mesasList){
            mesa.setNumeroMesa(count);
            count++;
        }
    }
}
