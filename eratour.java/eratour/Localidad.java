package eratour;

public class Localidad {

    private int numeroLocalidad;
    private double precio;
    private int capacidad;
    private int boletosVendidos;

    public Localidad(int numeroLocalidad, double precio) {

        this.numeroLocalidad = numeroLocalidad;
        this.precio = precio;
        this.capacidad = 20;
        this.boletosVendidos = 0;

    }

    public boolean hayEspacio() {
        return boletosVendidos < capacidad;
    }

    public int boletosDisponibles() {
        return capacidad - boletosVendidos;
    }

    public void venderBoletos(int cantidad) {

        boletosVendidos += cantidad;

    }

    public int getNumeroLocalidad() {
        return numeroLocalidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

}