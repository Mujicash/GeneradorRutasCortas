package Modelo;

import java.awt.*;
import java.io.Serializable;

/**
 * @author Andre Mujica
 **/

public class Circulo implements Serializable {

    //private final Coordenadas coordenadas;
    private final int x;
    private final int y;
    private int diametro;
    private String etiqueta;
    private Font fuente;
    private int izquierda;
    private Color color;

    public Circulo(int x, int y){
        // inicializando variables de instancia
        this.x = x;
        this.y = y;
        color = Color.yellow;
        diametro = 10;
        etiqueta = "";
        fuente = null;
        izquierda = 0;
    }

    public void dibujarCirculo(Graphics g){

        ((Graphics2D)g).setColor(color);
        ((Graphics2D)g).setStroke(new BasicStroke(2));

        ((Graphics2D)g).fillOval(x, y, diametro, diametro);
        ((Graphics2D)g).setColor(Color.black);
        ((Graphics2D)g).drawOval(x, y,diametro,diametro);
        if(!"".equals(etiqueta)){
            if(fuente != null){
                g.setFont(fuente);
            }

            ((Graphics2D)g).drawString(etiqueta, x - (izquierda), y);


            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        }
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(int izquierda) {
        this.izquierda = izquierda;
    }

}
