package model;

public class Pedido {

    //Atributos
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;

    //Constructor
    public Pedido (int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    //Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }
    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    //Metodo que sera sobrescrito
    public void asignarRepartidor(){
        System.out.println("Asignando repartidor...");
    }

    //Sobrecarga el metodo asignarRepartidor, recibe nombreRepartidor
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Asignando repartidor...");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
