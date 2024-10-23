package commands;

import elements.FlipperElement;

public class TargetHitCommand implements commands.HitCommand {
    @Override
    public void execute(FlipperElement element) {
        System.out.println("Target hit! Points awarded.");
        element.addPoints(100);
    }
}
