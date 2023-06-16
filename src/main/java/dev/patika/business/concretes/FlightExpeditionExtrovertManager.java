package dev.patika.business.concretes;

import dev.patika.business.abstracts.FlightExpeditionService;
import dev.patika.entities.abstracts.AirLine;
import dev.patika.entities.concretes.EcoChair;
import dev.patika.entities.concretes.THY;

public class FlightExpeditionExtrovertManager implements FlightExpeditionService {
    private AirLine airLine;

    public FlightExpeditionExtrovertManager(AirLine airLine) {
        this.airLine = airLine;
    }

    @Override
    public void YemekVer(int chairNum) {
        if (airLine instanceof THY && airLine.getChairList().get(chairNum) instanceof EcoChair)
            System.out.println("Türk hava yolları dış uçuşlarda yalnızca business sınıfa yemek verir.");
        else
            System.out.println("Afiyet olsun!");
    }
}
