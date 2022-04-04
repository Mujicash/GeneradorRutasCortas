package Controlador;

/**
 * @author Andre Mujica
 **/
public class ControllerStrategy {

    private IControlador strategy;

    public ControllerStrategy() {
    }

    public ControllerStrategy(IControlador strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IControlador strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.iniciar();
    }
}
