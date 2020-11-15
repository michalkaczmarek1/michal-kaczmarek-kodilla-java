package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(QueueStudent queueStudent) {
        System.out.println(name + ": New task in queue (Student: " + queueStudent.getName() + ")\n" +
                " (total: " + queueStudent.getTasks().size() + " tasks student)");
        updateCount++;
    }
}
