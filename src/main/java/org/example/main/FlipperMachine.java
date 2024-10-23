package main;

import states.FlipperState;
import states.NoCreditState;

public class FlipperMachine {
    private FlipperState currentState;

    public FlipperMachine() {
        currentState = new NoCreditState();
    }

    public void setState(FlipperState newState) {
        this.currentState = newState;
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void pressStart() {
        currentState.pressStart(this);
    }

    public void loseBall() {
        currentState.loseBall(this);
    }
}
