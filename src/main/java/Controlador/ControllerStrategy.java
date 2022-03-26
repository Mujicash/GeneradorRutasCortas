package Controlador;

/**
 * @author Andre Mujica
 **/
public class ControllerStrategy {

    private IControlador strategy;

    public ControllerStrategy() {
    }

    public void setStrategy(IControlador strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.iniciar();
    }
}
