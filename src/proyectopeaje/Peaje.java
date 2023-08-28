package proyectopeaje;

/**
 *
 * @author SENA
 */
public class Peaje {

    private int carros;
    private int buses;
    private int camiones;
    private int valorCarros = 7000;
    private int valorBuses = 10000;
    private int valorCamiones = 15000;

    public Peaje() {
    }

    public int getCarros() {
        return carros;
    }

    public int getBuses() {
        return buses;
    }

    public int getCamiones() {
        return camiones;
    }

    public int registrarCarro() {
        return carros++;
    }

    public int registrarBuses() {
        return buses++;
    }

    public int registrarCamiones() {
        return camiones++;
    }

    public int ValorPeajeCarro() {
        return valorCarros * carros;
    }

    public int ValorPeajeBuses() {
        return buses * valorBuses;
    }

    public int ValorPeajeCamiones() {
        return camiones * valorCamiones;
    }
    public int ValorPeajeTotal(){
        return ValorPeajeCarro()+ValorPeajeBuses()+ValorPeajeCamiones();
    }
}
