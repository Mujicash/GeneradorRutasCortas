package Modelo;

import Controlador.IControlador;

import javax.swing.*;

/**
 * @author Andre Mujica
 **/
public abstract class IVista extends JFrame {

    public IVista(String titulo) {
        super(titulo);
    }

    public abstract IControlador generarControlador();

}
