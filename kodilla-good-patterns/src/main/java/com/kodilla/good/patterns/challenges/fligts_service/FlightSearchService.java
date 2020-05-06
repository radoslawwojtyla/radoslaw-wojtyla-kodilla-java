package com.kodilla.good.patterns.challenges.fligts_service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchService {

    public List<Flight> departureAirportSearch(List<Flight> flights, String departureAirport) {
        return flights.stream()
                .filter(n -> n.getDepartureCity().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> arrivalAirportSearch(List<Flight> flights, String arrivalAirport) {
        return flights.stream()
                .filter(n -> n.getArrivalCity().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> directFlightSearch(List<Flight> flights, String departureAirport, String arrivalAirport) {
        return flights.stream()
                .filter(n -> n.getDepartureCity().equals(departureAirport))
                .filter(n -> n.getArrivalCity().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> allFlightsWithoutDirect(List<Flight> flights, String departureAirport, String arrivalAirport) {
        return flights.stream()
                .filter(n -> (n.getDepartureCity().equals(departureAirport) || n.getArrivalCity().equals(arrivalAirport)))
                .filter(n -> !(n.getDepartureCity().equals(departureAirport) && n.getArrivalCity().equals(arrivalAirport)))
                .collect(Collectors.toList());
    }

    public List<String> nonDirectFlightSearch(List<Flight> flights, String departureAirport, String arrivalAirport) {
        List<Flight> nonDirectFlightsList = allFlightsWithoutDirect(flights, departureAirport, arrivalAirport);
        List<String> connectionList = new ArrayList<>();

        for (int i = 0; i < nonDirectFlightsList.size(); i++) {
            String changeAirport = nonDirectFlightsList.get(i).getArrivalCity();
            LocalTime arrivalTimeChange = nonDirectFlightsList.get(i).getArrivalTime();

            List<Flight> resultList = nonDirectFlightsList.stream()
                    .filter(n -> n.getDepartureCity().equals(changeAirport))
                    .filter(n -> n.getDepartureTime().isAfter(arrivalTimeChange))
                    .collect(Collectors.toList());

            for (Flight flight : resultList) {
                if (nonDirectFlightsList.get(i).getDepartureCity().equals(departureAirport))
                    connectionList.add(nonDirectFlightsList.get(i) + " [change] " + flight);
            }
        }
        return connectionList;
    }
}