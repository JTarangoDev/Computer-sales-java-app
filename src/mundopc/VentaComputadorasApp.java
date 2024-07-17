package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaComputadorasApp {
    public static void main(String[] args) {
        // Crear objetos
        Raton ratonLogitech = new Raton("Bluetooth", "Logitech");
        Teclado tecladoGF = new Teclado("USB", "GameFactor");
        Monitor monitorGigabyte = new Monitor("Gigabyte", 32);

        Raton ratonRazer = new Raton("Bluetooth", "Razer");
        Teclado teclaoLogitech = new Teclado("USB", "Logitech");
        Monitor monitorSamsung = new Monitor("Samsung", 27);

        Raton ratonApple = new Raton("Bluetooth", "Apple");
        Teclado tecladoApple = new Teclado("Bluetooth", "Apple");
        Monitor monitorApple = new Monitor("Apple", 32);

        //Crea objeto tipo computadora
        Computadora computadoraAsus = new Computadora("PC Master Race", monitorGigabyte, tecladoGF, ratonLogitech);
        Computadora computadoraRog = new Computadora("PC Gamer Full RGB", monitorSamsung, teclaoLogitech, ratonRazer);
        Computadora Mac = new Computadora("iMac", monitorApple, tecladoApple, ratonApple);

        //Crea ordenes
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraRog);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(Mac);
        orden2.agregarComputadora(computadoraRog);
        orden2.agregarComputadora(computadoraAsus);
        orden2.mostrarOrden();

    }
}