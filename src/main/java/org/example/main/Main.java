package org.example.main;


//import elements.*;
import visitors.ScoreVisitor;
import visitors.ResetVisitor;
import commands.TargetHitCommand;

public class Main {
    public static void main(String[] args) {
        main.FlipperMachine machine = new main.FlipperMachine();

        // Test State Transitions
        machine.insertCoin();
        machine.pressStart();
        machine.loseBall();
        machine.loseBall();
        machine.loseBall();

        // Create Flipper Elements and hit them
        elements.Target target = new elements.Target(new TargetHitCommand());
        elements.Bumper bumper = new elements.Bumper();

        target.hit();
        bumper.hit();

        // Use Visitors
        ScoreVisitor scoreVisitor = new ScoreVisitor();
        ResetVisitor resetVisitor = new ResetVisitor();

        scoreVisitor.visit(target);
        scoreVisitor.visit(bumper);

        resetVisitor.visit(target);
        resetVisitor.visit(bumper);
    }
}
