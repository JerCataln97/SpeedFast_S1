package model;

//Esta clase hereda atributos de la clase Pedido
public class PedidoExpress extends Pedido {

    //Constructor
    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    //Sobrescritura del metodo asignarRepartidor
    @Override
    public void asignarRepartidor(){
        System.out.println("[Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado.");
    }

    //Sobrescritura del metodo sobrecargado
    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Express]");
        System.out.println("Asignando repartidor...");
        System.out.println("Repartidor mas cercano con disponibilidad inmediata encontrado.");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
