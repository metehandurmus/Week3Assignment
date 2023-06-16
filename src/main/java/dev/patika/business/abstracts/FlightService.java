package dev.patika.business.abstracts;

import dev.patika.entities.concretes.FlightExpedition;

import java.util.List;

public interface FlightService {
    void run();

    void printScreen(List<FlightExpedition> flightExpeditionList);

    String[] selectNumbers();
}
