package app;

import model.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("           SPEED FAST            ");
        System.out.println("---------------------------------");
        System.out.println();

        //Crea los pedidos
        Pedido pCom = new PedidoComida(11,"Los Maitenes 987","Comida");
        Pedido pEnc = new PedidoEncomienda(12,"Los Alerces 143","Encomienda");
        Pedido pExp = new PedidoExpress(13, "Alameda 456", "Express");

        //Asigna los repartidores a los pedidos
        pCom.asignarRepartidor("Alberto Castro");

        System.out.println("---------------------------------");

        pEnc.asignarRepartidor("Miguel Lopez");

        System.out.println("---------------------------------");

        pExp.asignarRepartidor("Angel Salazar");

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("        SIN NUEVOS PEDIDOS       ");
        System.out.println("---------------------------------");
    }
}
