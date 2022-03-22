package Util;

import javax.swing.*;
import java.awt.*;

/**
 * @author Andre Mujica
 **/
public class FondoPanel extends JPanel {

    private Image imagen;

    @Override
    public void paint(Graphics g){

        imagen = new ImageIcon(getClass().getResource("/Imagenes/sanmiguel.jpeg")).getImage();

        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

        setOpaque(false);

        super.paint(g);
    }

}
