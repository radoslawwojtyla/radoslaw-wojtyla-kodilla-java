package com.kodilla.patterns2.observer.homework;

public interface ObservableH {
    void registerObserverH(ObserverH observerH);
    void notifyObserverH();
    void removeObserverH(ObserverH observerH);
}
