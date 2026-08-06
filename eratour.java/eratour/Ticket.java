package eratour;

import java.util.Random;

public class Ticket {

    private int numeroTicket;
    private boolean aptoParaCompra;

    public Ticket() {
        generarNumeroTicket();
        aptoParaCompra = false;
    }

    public void generarNumeroTicket() {
        Random random = new Random();
        numeroTicket = random.nextInt(15000) + 1;
    }

    public void evaluarTicket(int a, int b) {

        if (numeroTicket >= Math.min(a, b) &&
            numeroTicket <= Math.max(a, b)) {

            aptoParaCompra = true;

        } else {

            aptoParaCompra = false;

        }
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public boolean isAptoParaCompra() {
        return aptoParaCompra;
    }

}