package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTask implements ObservableH {
    private final List<ObserverH> observersListH;
    private List<String> tasks;
    private String student;

    public StudentTask(String student) {
        this.student = student;
        observersListH = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserverH();
    }

    @Override
    public void registerObserverH(ObserverH observerH) {
        observersListH.add(observerH);

    }
    @Override
    public void notifyObserverH() {
        for (ObserverH observer : observersListH) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserverH(ObserverH observerH) {
        observersListH.remove(observerH);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }
}
