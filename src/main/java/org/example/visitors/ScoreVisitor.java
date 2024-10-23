package visitors;

import elements.FlipperElement;

public class ScoreVisitor {
    public void visit(FlipperElement element) {
        System.out.println("Total points: " + element.getPoints());
    }
}
