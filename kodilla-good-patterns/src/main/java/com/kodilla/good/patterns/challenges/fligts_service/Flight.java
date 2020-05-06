package com.kodilla.good.patterns.challenges.fligts_service;

import java.time.LocalTime;

public class Flight {
    private String arrivalCity;
    private String departureCity;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public Flight(String departureCity, String arrivalCity, LocalTime departureTime, LocalTime arrivalTime) {
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!getArrivalCity().equals(flight.getArrivalCity())) return false;
        if (!getDepartureCity().equals(flight.getDepartureCity())) return false;
        if (!getDepartureTime().equals(flight.getDepartureTime())) return false;
        return getArrivalTime().equals(flight.getArrivalTime());
    }

    @Override
    public int hashCode() {
        int result = getArrivalCity().hashCode();
        result = 31 * result + getDepartureCity().hashCode();
        result = 31 * result + getDepartureTime().hashCode();
        result = 31 * result + getArrivalTime().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight from "+  departureCity + "[" + departureTime + "] to " + arrivalCity + "[" + arrivalTime + "]";
    }
}
