package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Drive test", "home", "car");
            case PAINTING:
                return new PaintingTask("Paint test", "red", "landscape");
            case SHOPPING:
                return new ShoppingTask("Buy test", "shoes", 10);
            default:
                return null;
        }
    }
}
