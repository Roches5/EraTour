package eratour;

public class Comprador {

    private String nombre;
    private String email;
    private int cantidadBoletos;
    private double presupuestoMaximo;

    public Comprador() {

    }

    public Comprador(String nombre, String email, int cantidadBoletos, double presupuestoMaximo) {
        this.nombre = nombre;
        this.email = email;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuestoMaximo = presupuestoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public double getPresupuestoMaximo() {
        return presupuestoMaximo;
    }

    public void setPresupuestoMaximo(double presupuestoMaximo) {
        this.presupuestoMaximo = presupuestoMaximo;
    }
}