package elements;

public class Bumper extends elements.FlipperElement {
    @Override
    public void hit() {
        System.out.println("Bumper is hit! Adding 20 points.");
        addPoints(20);
    }
}
