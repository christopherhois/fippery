package elements;

public abstract class FlipperElement {
    protected int points;

    public abstract void hit();

    public void addPoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }
}
