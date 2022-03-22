package Modelo;

import java.io.Serializable;

/**
 * @author Andre Mujica
 **/
public class Arista implements Serializable {

    private int idArista;
    //private String nombreArista;
    private Segmento segmento;//Ésta es la via representada graficamente
    private boolean habilitado;
    private int distancia; //Distancia entre dos puntos
    private Nodo destino;

    public Arista(int idArista, int peso, Nodo destino) {
        this.idArista = idArista;
        this.distancia = peso;
        segmento = null;
        habilitado = true;
        this.destino = destino;
    }

    public Arista(int peso, Segmento segmento, Nodo destino){
        this.idArista = -1;
        this.distancia = peso;
        this.segmento = segmento;
        agregarLongitudSegmento();
        habilitado = true;
        this.destino = destino;
    }

    public void setIdArista(int idArista){
        this.idArista = idArista;
    }

    public int getIdArista(){
        return idArista;
    }
    /*
    public void setNombreArista(String nombreVia){
        this.nombreArista = nombreVia;
    }

    public String getNombreArista(){
        return nombreArista;
    }
    */
    public int getPeso() {
        return distancia;
    }

    public void setPeso(int peso) {
        this.distancia = peso;
    }

    public void setSegemento(Segmento segmento){
        this.segmento = segmento;
        agregarLongitudSegmento();
    }

    private void agregarLongitudSegmento(){
        if(segmento != null){
            this.segmento.setLongitud(distancia);
        }
    }

    public Segmento getSegmento(){
        return segmento;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public Nodo getDestino() {
        return destino;
    }

}