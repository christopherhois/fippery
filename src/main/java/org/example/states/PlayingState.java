package states;

import main.FlipperMachine;

public class PlayingState implements states.FlipperState {
    private int balls = 3;

    @Override
    public void insertCoin(FlipperMachine machine) {
        System.out.println("Game in progress. Extra credit added.");
    }

    @Override
    public void pressStart(FlipperMachine machine) {
        System.out.println("Already playing!");
    }

    @Override
    public void loseBall(FlipperMachine machine) {
        balls--;
        System.out.println("Ball lost. Remaining balls: " + balls);
        if (balls <= 0) {
            System.out.println("Game over!");
            machine.setState(new states.NoCreditState());
        }
    }
}
