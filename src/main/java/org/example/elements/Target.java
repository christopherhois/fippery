package elements;

import commands.HitCommand;

public class Target extends elements.FlipperElement {
    private HitCommand hitCommand;

    public Target(HitCommand hitCommand) {
        this.hitCommand = hitCommand;
    }

    @Override
    public void hit() {
        System.out.println("Target is hit.");
        hitCommand.execute(this);
    }
}
