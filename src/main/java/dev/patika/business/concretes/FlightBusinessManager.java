package dev.patika.business.concretes;

import dev.patika.business.abstracts.FlightExpeditionService;
import dev.patika.core.utilities.enums.FlightType;
import dev.patika.entities.concretes.FlightExpedition;

public class FlightBusinessManager {
    private FlightExpeditionService flightExpeditionService;

    public FlightBusinessManager(FlightExpedition flightExpedition){
        if (flightExpedition.getFlightType() == FlightType.INTROVERT) {
            flightExpeditionService = new FlightExpeditionIntrovertManager(flightExpedition.getAirLine());
        } else {
            flightExpeditionService = new FlightExpeditionExtrovertManager(flightExpedition.getAirLine());
        }
    }

    public void YemekVer(int chairNum) {
        flightExpeditionService.YemekVer(chairNum);
    }
}
