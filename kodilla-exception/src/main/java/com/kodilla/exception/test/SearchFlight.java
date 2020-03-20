package com.kodilla.exception.test;

//        Stwórz klasę zawierającą logikę imitującą wyszukiwanie lotów:
//        a) metoda findFilght(Flight flight)
//        b) wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska,
//        a wartością Boolean informujący o tym czy można na dane lotnisko polecieć.
//        Przykład: Map<String, Boolean>.
//        c) logika powinna wyszukiwać loty w mapie.
//        Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.


import java.util.HashMap;
import java.util.Map;

public class SearchFlight {


    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> arrivalAirport = new HashMap<>();
        arrivalAirport.put("Tokyo", true);
        arrivalAirport.put("Berlin", false);
        arrivalAirport.put("New York", true);
        arrivalAirport.put("Kiev", true);
        arrivalAirport.put("London", false);

        if (arrivalAirport.containsKey(flight.getArrivalAirport()) == true && flight.getDepartureAirport() != null) {
            System.out.println("The airport exist.");
        } else {
            throw new RouteNotFoundException("The airport doesn't exist");
        }
    }
}
