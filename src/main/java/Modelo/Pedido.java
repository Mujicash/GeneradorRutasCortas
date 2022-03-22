package Modelo;

import java.util.Date;

/**
 * @author Andre Mujica
 **/
public class Pedido {

    private Integer idPedido;
    private Local local;
    private Transportista transportista;
    private Date fechaPedido;
    private String descripcion;
    private boolean atendido;

    public Pedido() {
    }

    public Pedido(Integer idPedido, Local local, Transportista transportista, Date fechaPedido, String descripcion, boolean atendido) {
        this.idPedido = idPedido;
        this.local = local;
        this.transportista = transportista;
        this.fechaPedido = fechaPedido;
        this.descripcion = descripcion;
        this.atendido = atendido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    @Override
    public String toString() {
        return "Pedido: " + descripcion + "\nLocal: " + local.getNombre();
    }
}
