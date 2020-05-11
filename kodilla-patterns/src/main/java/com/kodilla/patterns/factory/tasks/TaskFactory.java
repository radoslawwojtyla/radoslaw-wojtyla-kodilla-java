package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String PAINTING = "Painting task";
    public static final String DRIVING = "Driving task";
    public static final String SHOPPING = "Shopping task";

    public final Task createTask(final String Task) {
        switch (Task) {
            case PAINTING:
                return new PaintingTask("Refresh dining room", "Light grey", "South wall in dinig room");
            case DRIVING:
                return new DrivingTask("Praying", "Church", "Bicycle");
            case SHOPPING:
                return new ShoppingTask("Present for mommy", "Sweater", 1.0);
            default:
                return null;
        }
    }
}
