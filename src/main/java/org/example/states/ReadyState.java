package states;

import main.FlipperMachine;

public class ReadyState implements states.FlipperState {
    @Override
    public void insertCoin(FlipperMachine machine) {
        System.out.println("Additional coin inserted.");
    }

    @Override
    public void pressStart(FlipperMachine machine) {
        System.out.println("Game started!");
        machine.setState(new states.PlayingState());
    }

    @Override
    public void loseBall(FlipperMachine machine) {
        System.out.println("No game in progress.");
    }
}
