package eratour;

import java.util.Random;

public class Sistemaventa {

    private Comprador compradorActual;
    private Ticket ticketActual;

    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;

    private Random random;

    public Sistemaventa() {

        localidad1 = new Localidad(1,100);
        localidad5 = new Localidad(5,500);
        localidad10 = new Localidad(10,1000);

        random = new Random();

    }

    public void nuevoComprador(Comprador comprador){

        compradorActual = comprador;

    }

    public Ticket generarTicket(){

        ticketActual = new Ticket();
        return ticketActual;

    }

    public Localidad seleccionarLocalidad(){

        int numero = random.nextInt(3);

        if(numero==0){
            return localidad1;
        }

        if(numero==1){
            return localidad5;
        }

        return localidad10;

    }

    public void consultarDisponibilidadTotal(){

        System.out.println("Localidad 1: "
                + localidad1.boletosDisponibles());

        System.out.println("Localidad 5: "
                + localidad5.boletosDisponibles());

        System.out.println("Localidad 10: "
                + localidad10.boletosDisponibles());

    }

    public void reporteCaja(){

        double total =
                localidad1.getBoletosVendidos()*100 +
                localidad5.getBoletosVendidos()*500 +
                localidad10.getBoletosVendidos()*1000;

        System.out.println("Caja total: $" + total);

    }

}