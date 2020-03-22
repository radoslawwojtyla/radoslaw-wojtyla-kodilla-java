package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public static boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> arrivalAirport = new HashMap<>();
        arrivalAirport.put("Tokyo", true);
        arrivalAirport.put("Berlin", false);
        arrivalAirport.put("New York", true);
        arrivalAirport.put("Kiev", true);
        arrivalAirport.put("London", false);

        if (arrivalAirport.containsKey(flight.getArrivalAirport()) == false || flight.getDepartureAirport() == null) {
            throw new RouteNotFoundException("The airport doesn't exist");
        } else {
            return arrivalAirport.get(flight.getArrivalAirport());
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight("London", "Kiev");
        try {
            findFlight(flight);
            System.out.println("The airport exists");
        } catch (RouteNotFoundException e) {
            System.out.println("The flight is unavailable");
            System.out.println("Error: " + e);
        }
    }
}
