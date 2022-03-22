package Modelo;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Andre Mujica
 **/
public class Grafo implements Serializable {

    private final ArrayList<Nodo> listaNodo;
    private final boolean dirigido;

    public Grafo(boolean dirigido){
        listaNodo = new ArrayList<>();
        this.dirigido = dirigido;
    }

    public boolean adjuntarNodo(Nodo nodo){
        Nodo nodoTemp = buscarNodo(nodo.getNombre());

        if(nodoTemp == null){ //no existe el nodo
            listaNodo.add(nodo);
            return true;
        }else{
            return false;
        }
    }

    public void crearEnlaces(Nodo origen, int idArista, int peso, Nodo destino){
        if(origen != null){
            origen.addNodoAdyacente(new Arista(idArista, peso, destino));

            if(!dirigido){ //no dirigido
                destino.addNodoAdyacente(new Arista(idArista, peso, origen));
            }
        }
    }

    public void crearEnlaces(Nodo origen, int peso, Segmento segmento, Nodo destino){
        if(origen != null){
            origen.addNodoAdyacente(new Arista(peso, segmento, destino));

            if(!dirigido){ //no dirigido
                destino.addNodoAdyacente(new Arista(peso, segmento, origen));
            }
        }
    }

    public void crearEnlaces(Nodo origen, Nodo destino, Arista arista){
        if(origen != null){
            arista.setDestino(destino);
            origen.addNodoAdyacente(arista);

            if(!dirigido){ //no dirigido
                arista.setDestino(origen);
                destino.addNodoAdyacente(arista);
            }
        }
    }

    public Nodo buscarNodo(Object dato){
        Nodo temp = null;

        if(dato != null){
            for(Nodo nodo:listaNodo){
                if(dato.equals(nodo.getNombre())){
                    temp = nodo;
                }
            }
        }

        return temp;
    }

    public Nodo buscarNodo(int x, int y){
        Nodo nodoAuxiliar = null;

        for (Nodo nodo : listaNodo) {
            int xNodo = nodo.getCirculo().getX();
            int yNodo = nodo.getCirculo().getY();

            if (x > xNodo && x < (xNodo + nodo.getCirculo().getDiametro())) {
                if (y > yNodo && y < (yNodo + nodo.getCirculo().getDiametro())) {
                    nodoAuxiliar = nodo;
                    break;
                }
            }
        }

        return nodoAuxiliar;
    }

    public ArrayList<Nodo> getAdyacentes(Object dato){
        ArrayList<Nodo> lista = null;
        Nodo principal = buscarNodo(dato);
        ArrayList<Arista> aristas = principal.getListaNodoAdyacente();
        if(aristas != null){
            lista = new ArrayList<>();
            for (Arista arista : aristas) {
                lista.add(arista.getDestino());
            }
        }
        return lista;
    }

    public ArrayList<Nodo> getListaNodos(){
        return listaNodo;
    }

    public boolean isAdyacente(Nodo n1, Nodo n2){
        boolean aux = false;
        ArrayList<Arista> listaAristas = n1.getListaNodoAdyacente();
        if(listaAristas != null){
            for (Arista listaArista : listaAristas) {
                if (listaArista.getDestino() == n2) {
                    aux = true;
                    break;
                }
            }
        }
        return aux;
    }

    public boolean isAdyacente(Object datoNodoInicio,Object datoNodoDestino){
        Nodo n1 = buscarNodo(datoNodoInicio);
        Nodo n2 = buscarNodo(datoNodoDestino);

        return isAdyacente(n1,n2);
    }

    public Arista getArista(Object datoNodo1,Object datoNodo2){
        return getArista(buscarNodo(datoNodo1),buscarNodo(datoNodo2));
    }

    public Arista getArista(Nodo n1, Nodo n2){
        Arista aux = null;
        if(isAdyacente(n1, n2)){
            ArrayList<Arista> listaAristas = n1.getListaNodoAdyacente();
            for (Arista listaArista : listaAristas) {
                if (listaArista.getDestino() == n2) {
                    aux = listaArista;
                }
            }
        }else if(isAdyacente(n2, n1)){
            aux = getArista(n2, n1);
        }
        return aux;
    }

    public Arista getEnlace(Object datoNodo1, Object datoNodo2){
        Arista aux = null;
        if(isAdyacente(datoNodo1, datoNodo2)){
            Nodo n1 = buscarNodo(datoNodo1);
            Nodo n2 = buscarNodo(datoNodo2);
            ArrayList<Arista> listaAristas = n1.getListaNodoAdyacente();
            for (Arista listaArista : listaAristas) {
                if (listaArista.getDestino() == n2) {
                    aux = listaArista;
                }
            }
        }
        else if(isAdyacente(datoNodo2, datoNodo1)){
            aux = getEnlace(datoNodo2, datoNodo1);
        }
        return aux;
    }

    public void reiniciarGrafoParaDisjktra(){
        for(Nodo n:listaNodo){
            n.setMarca(false);
            n.setNodoAntecesorDisjktra(null);
            n.setLongitudCamino(-1);
        }
    }

    public boolean eliminarNodo(Nodo nodo){
        boolean retornado = false;
        if(nodo != null){
            retornado = listaNodo.remove(nodo);
        }
        return retornado;
    }

    public void reiniciarColores() {
        if(listaNodo != null){
            for(Nodo nodo: listaNodo){
                nodo.getCirculo().setColor(Color.yellow);
                ArrayList<Arista> la = nodo.getListaNodoAdyacente();
                if(la != null){
                    for(Arista enlace:la){
                        if(enlace.isHabilitado()){
                            enlace.getSegmento().setColor(Color.black);
                            enlace.getSegmento().setGrosorLinea(1);
                        }
                    }
                }
            }
        }
    }

    public ArrayList<Arista> aristasEntrante(Nodo nodo){
        ArrayList<Arista> listaArista = null;
        for(Nodo n:listaNodo){
            ArrayList<Arista> enlaces = n.getListaNodoAdyacente();
            if(enlaces != null){
                listaArista = new ArrayList<Arista>();
                for(Arista e:enlaces){
                    if(e.getDestino() == nodo){
                        listaArista.add(e);
                    }
                }
            }
        }
        return listaArista;
    }

    public ArrayList<Arista> aristasSaliente(Nodo nodo){
        ArrayList<Arista> listaArista = null;
        if(nodo != null){
            if(listaNodo.contains(nodo)){
                ArrayList<Arista> listaEnlace = nodo.getListaNodoAdyacente();
                if(listaEnlace != null){ //listaArista
                    listaArista = listaEnlace;
                }
            }
        }
        return listaArista;
    }

    private void eliminarAristas(Nodo nodo){
        ArrayList<Arista> aristas = aristasSaliente(nodo);
        for(Arista a:aristas){
            a = null;
        }
    }

    public void eliminarAristasSalientes(Nodo nodo){
        ArrayList<Arista> aristas = aristasSaliente(nodo);
        eliminarAristas(nodo);
    }

    public void eliminarAristasEntrante(Nodo nodo){
        ArrayList<Arista> aristas = aristasEntrante(nodo);
        eliminarAristas(nodo);
    }


}
