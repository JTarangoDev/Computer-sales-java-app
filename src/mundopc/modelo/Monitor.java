package mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double size;
    private static int contadorMonitores;

    private Monitor (){
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double size){
        this(); // Primero se mana a llamar constructor privado cada que se crea un objeto de clase Monitor
        this.marca = marca;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", size=" + size +
                '}';
    }
}
