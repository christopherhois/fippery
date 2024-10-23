package states;

import main.FlipperMachine;

public class NoCreditState implements states.FlipperState {
    @Override
    public void insertCoin(FlipperMachine machine) {
        System.out.println("Coin inserted.");
        machine.setState(new states.ReadyState());
    }

    @Override
    public void pressStart(FlipperMachine machine) {
        System.out.println("No credit! Please insert a coin.");
    }

    @Override
    public void loseBall(FlipperMachine machine) {
        System.out.println("No ball to lose.");
    }
}
