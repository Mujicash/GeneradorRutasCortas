package Modelo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Andre Mujica
 **/
public class Dijkstra {

    private final Grafo grafo;

    public Dijkstra(Grafo grafo){
        this.grafo = grafo;
    }

    public void calcular(Nodo origen, Nodo destino){
        ArrayList<Nodo> listaVerticesAdyacentes = new ArrayList<>();
        ArrayList<Arista> aux = new ArrayList<>();
        origen.setLongitudCamino(0);

        if(destino != null){
            listaVerticesAdyacentes.add(origen);

            while(!listaVerticesAdyacentes.isEmpty()){
                Nodo menor = buscarMenor(listaVerticesAdyacentes);
                menor.setMarca(true);
                listaVerticesAdyacentes.remove(menor);
                llenarConAdyacente(menor, listaVerticesAdyacentes);
            }

            marcarRutaCorta(destino, aux);
        }
    }

    private void llenarConAdyacente(Nodo nodo, ArrayList<Nodo> listaVerticesAdyacentes){
        if(nodo != null){
            ArrayList<Arista> listaAux = nodo.getListaNodoAdyacente();
            if(listaAux != null){
                for(Arista enlace : listaAux){
                    Nodo aux2 = enlace.getDestino();

                    if(!aux2.isMarca()){
                        if(contiene(aux2, listaVerticesAdyacentes)){
                            int longitud = nodo.getLongitudCamino() + enlace.getPeso();
                            if(aux2.getLongitudCamino() > longitud){
                                aux2.setLongitudCamino(longitud);
                                aux2.setNodoAntecesorDisjktra(nodo);
                            }
                        }else{
                            aux2.setLongitudCamino(nodo.getLongitudCamino() + enlace.getPeso());
                            aux2.setNodoAntecesorDisjktra(nodo);
                            listaVerticesAdyacentes.add(aux2);
                        }
                    }
                }
            }
        }
    }

    private void rutaCorta(Nodo destino, ArrayList<Arista> aux){
        aux.clear();
        Nodo nAux = destino;
        while(nAux.getNodoAntecesorDisjktra() != null){
            aux.add(grafo.getArista(nAux, nAux.getNodoAntecesorDisjktra()));
            nAux = nAux.getNodoAntecesorDisjktra();
        }
    }

    private void marcarRutaCorta(Nodo destino, ArrayList<Arista> aux){
        if(destino != null){
            rutaCorta(destino, aux);
            for (Arista arista : aux) {
                arista.getSegmento().setColor(Color.red);
                arista.getSegmento().setGrosorLinea(4);
            }
        }
    }

    private Nodo buscarMenor(ArrayList<Nodo> listaVerticesAdyacentes){
        Nodo auxiliar = new Nodo();
        auxiliar.setLongitudCamino(9999999);

        for(Nodo i : listaVerticesAdyacentes){
            if(i.getLongitudCamino() < auxiliar.getLongitudCamino()){
                auxiliar = i;
            }
        }

        return auxiliar;
    }

    private boolean contiene(Nodo nodo, ArrayList<Nodo> listaVerticesAdyacentes){
        boolean encontrado = false;
        Iterator<Nodo> it = listaVerticesAdyacentes.iterator();

        while(it.hasNext() && !encontrado){
            if(it.next() == nodo){
                encontrado = true;
            }
        }

        return encontrado;
    }

}
