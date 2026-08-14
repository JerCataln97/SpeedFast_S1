package model;

//Esta clase hereda atributos de la clase Pedido
public class PedidoEncomienda extends Pedido {

    //Constructor
    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    //Sobrescritura del metodo asignarRepartidor
    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Validando peso y embalaje... OK");
    }

    //Sobrescritura del metodo sobrecargado
    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");
        System.out.println("Validando peso y embalaje... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
