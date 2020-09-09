package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverH {
    private final String mentor;
    private int updateCount;

    public Mentor(String menthor) {
        this.mentor = menthor;
    }

    @Override
    public void update(StudentTask studentTask) {
        System.out.println("Dear " + mentor + " you have new task from student: " + studentTask.getStudent()
        + ". Total number of tasks in queue: " + studentTask.getTasks().size());
        updateCount++;
    }

    public String getMentor() {
        return mentor;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
