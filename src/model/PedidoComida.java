package model;

//Esta clase hereda atributos de la clase Pedido
public class PedidoComida extends Pedido {

    //Constructor
    public PedidoComida (int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    //Sobrescritura del metodo asignarRepartidor
    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
    }

    //Sobrescritura del metodo sobrecargado
    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Comida]");
        System.out.println("Asignando repartidor...");
        System.out.println("Verificando mochila termica... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
