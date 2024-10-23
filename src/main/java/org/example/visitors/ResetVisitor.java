package visitors;

import elements.FlipperElement;

public class ResetVisitor {
    public void visit(FlipperElement element) {
        element.addPoints(-element.getPoints());
        System.out.println("Flipper element reset.");
    }
}
