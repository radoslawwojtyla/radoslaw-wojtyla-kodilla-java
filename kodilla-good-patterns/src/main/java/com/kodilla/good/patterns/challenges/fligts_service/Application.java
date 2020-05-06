package com.kodilla.good.patterns.challenges.fligts_service;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        FlightSearchService searchFlight = new FlightSearchService();
        FlightDataBase flightDataBase = new FlightDataBase();
        List<Flight> flightList = flightDataBase.dataBase();

        List<Flight> resultList;

        System.out.println("-----FLIGHT FROM-----");
        resultList = searchFlight.departureAirportSearch(flightList, "Poznan");
        for (Flight flight : resultList) {
            System.out.println(flight);
        }

        System.out.println("-----FLIGHT TO-----");
        resultList = searchFlight.arrivalAirportSearch(flightList, "Warszawa");
        for (Flight flight : resultList) {
            System.out.println(flight);
        }
        System.out.println("-----DIRECT FLIGHT-----");

        resultList = searchFlight.directFlightSearch(flightList, "Poznan", "Warszawa");
        for (Flight flight : resultList) {
            System.out.println(flight);
        }

        System.out.println("-----NON-DIRECT FLIGHT-----");
        List<String> resultList2 = searchFlight.nonDirectFlightSearch(flightList, "Poznan", "Warszawa");
        resultList2.forEach(System.out::println);
    }
}


