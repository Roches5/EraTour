package eratour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            Sistemaventa sistema = new Sistemaventa();

            int opcion;

            do{

                System.out.println("\n====== THE ERAS TOUR ======");
                System.out.println(" --- Taylor Swift ---");
                System.out.println("1. Nuevo comprador");
                System.out.println("2. Nueva solicitud");
                System.out.println("3. Consultar disponibilidad");
                System.out.println("4. Reporte de caja");
                System.out.println("5. Salir");

                opcion = teclado.nextInt();
                teclado.nextLine();

                switch(opcion){

                    case 1:

                        System.out.print("Nombre: ");
                        String nombre = teclado.nextLine();

                        System.out.print("Email: ");
                        String email = teclado.nextLine();

                        System.out.print("Cantidad boletos: ");
                        int cantidad = teclado.nextInt();

                        System.out.print("Presupuesto: ");
                        double presupuesto = teclado.nextDouble();

                        Comprador comprador = new Comprador(
                                nombre,
                                email,
                                cantidad,
                                presupuesto
                        );

                        sistema.nuevoComprador(comprador);

                        System.out.println("Comprador registrado.");

                        break;

                    case 2:

                        Ticket ticket = sistema.generarTicket();

                        System.out.println("Ticket generado: "
                                + ticket.getNumeroTicket());

                        break;

                    case 3:

                        sistema.consultarDisponibilidadTotal();

                        break;

                    case 4:

                        sistema.reporteCaja();

                        break;

                }

            }while(opcion!=5);
        }

    }

}