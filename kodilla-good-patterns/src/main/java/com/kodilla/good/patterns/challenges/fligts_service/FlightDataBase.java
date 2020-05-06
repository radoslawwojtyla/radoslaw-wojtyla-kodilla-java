package com.kodilla.good.patterns.challenges.fligts_service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class FlightDataBase {

    List<Flight> flightList = new ArrayList<>();

    public List<Flight> dataBase() {
        flightList.add(new Flight("Poznan", "Wroclaw", LocalTime.of(5, 25), LocalTime.of(6, 15)));
        flightList.add(new Flight("Poznan", "Wroclaw", LocalTime.of(10,45), LocalTime.of(11,35)));
        flightList.add(new Flight("Poznan", "Wroclaw", LocalTime.of(17,05), LocalTime.of(17,50)));
        flightList.add(new Flight("Poznan", "Krakow", LocalTime.of(8,59), LocalTime.of(9,50)));
        flightList.add(new Flight("Poznan", "Krakow", LocalTime.of(14,20), LocalTime.of(15,10)));
        flightList.add(new Flight("Poznan", "Krakow", LocalTime.of(20,30), LocalTime.of(21,15)));
        flightList.add(new Flight("Poznan", "Warszawa", LocalTime.of(7,55), LocalTime.of(8,30)));
        flightList.add(new Flight("Poznan", "Warszawa", LocalTime.of(12,15), LocalTime.of(12,45)));
        flightList.add(new Flight("Poznan", "Warszawa", LocalTime.of(19,00), LocalTime.of(19,35)));
        flightList.add(new Flight("Wroclaw", "Warszawa", LocalTime.of(8,00), LocalTime.of(8,45)));
        flightList.add(new Flight("Wroclaw", "Krakow", LocalTime.of(16,00), LocalTime.of(16,40)));
        flightList.add(new Flight("Wroclaw", "Warszawa", LocalTime.of(20,00), LocalTime.of(20,45)));
        flightList.add(new Flight("Krakow", "Wroclaw", LocalTime.of(7,55), LocalTime.of(8,30)));
        flightList.add(new Flight("Krakow", "Warszawa", LocalTime.of(16,50), LocalTime.of(17,25)));
        return flightList;
    }

}
