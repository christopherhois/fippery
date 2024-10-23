package states;

import main.FlipperMachine;

public interface FlipperState {
    void insertCoin(FlipperMachine machine);
    void pressStart(FlipperMachine machine);
    void loseBall(FlipperMachine machine);
}
