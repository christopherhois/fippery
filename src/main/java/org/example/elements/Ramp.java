package elements;

public class Ramp extends elements.FlipperElement {
    private boolean isOpen = false;

    public void open() {
        isOpen = true;
        System.out.println("Ramp opened!");
    }

    @Override
    public void hit() {
        if (isOpen) {
            System.out.println("Ball passed through the ramp.");
            addPoints(50);
        } else {
            System.out.println("Ramp is closed.");
        }
    }
}
