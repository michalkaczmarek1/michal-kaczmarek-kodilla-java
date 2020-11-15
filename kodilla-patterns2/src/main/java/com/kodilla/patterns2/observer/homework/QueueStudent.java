package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class QueueStudent implements Observable{
    private final List<Observer> observers;
    private final Deque<String> tasks;
    private final String name;

    public QueueStudent(String name) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
