package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Andre Mujica
 **/

public class Nodo implements Serializable {

    private int idNodo;
    private String nombre;
    private ArrayList<Arista> listaNodoAdyacente;
    private boolean visitado = false;
    private Circulo circulo;
    private int izquierda;
    private int x;
    private int y;

    private int longitudCamino; //Para uso de la clase Disjktra
    private Nodo nodoAntecesorDisjktra; //Para uso de la clase Disjktra
    private boolean marca;//Para uso de la clase Disjktra

    public Nodo(){
        this.nombre = "";
        circulo = null;
        izquierda = 0;
        inicializarDijkstra();
    }

    /*
    public Nodo(String nombre, Coordenadas coordenadas) {
        this.nombre = nombre;
        listaNodoAdyacente = new ArrayList<>();
        circulo = new Circulo(coordenadas);
        circulo.setIzquierda(izquierda);
        inicializarDijkstra();
    }*/

    public Nodo(String nombre, int x, int y){
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        listaNodoAdyacente = new ArrayList<>();
        circulo = new Circulo(x,y);
        circulo.setIzquierda(izquierda);
        inicializarDijkstra();
    }

    public Nodo(int idNodo, String nombre, int x, int y){
        this.idNodo = idNodo;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        listaNodoAdyacente = new ArrayList<>();
        circulo = new Circulo(x,y);
        circulo.setIzquierda(izquierda);
        inicializarDijkstra();
    }

    private void inicializarDijkstra(){
        longitudCamino = -1;
        nodoAntecesorDisjktra = null;
        marca = false;
    }

    public int getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(int idNodo) {
        this.idNodo = idNodo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Arista> getListaNodoAdyacente(){
        ArrayList<Arista> listAristaAux = null;
        if(!listaNodoAdyacente.isEmpty()){
            listAristaAux = new ArrayList<Arista>();
            for(Arista enlace:listaNodoAdyacente){
                if(enlace.isHabilitado()){
                    listAristaAux.add(enlace);
                }
            }
        }
        return listAristaAux;
    }

    public void addNodoAdyacente(Arista arista){
        listaNodoAdyacente.add(arista);
    }

    public void setVisitado(boolean visitado){
        this.visitado = visitado;
    }

    public boolean isVisitado(){
        return visitado;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public int getLongitudCamino() {
        return longitudCamino;
    }

    public void setLongitudCamino(int longitudCamino) {
        this.longitudCamino = longitudCamino;
    }

    public boolean isMarca() {
        return marca;
    }

    public void setMarca(boolean marca) {
        this.marca = marca;
    }

    public Nodo getNodoAntecesorDisjktra() {
        return nodoAntecesorDisjktra;
    }

    public void setNodoAntecesorDisjktra(Nodo nodoAntecesorDisjktra) {
        this.nodoAntecesorDisjktra = nodoAntecesorDisjktra;
    }

}
