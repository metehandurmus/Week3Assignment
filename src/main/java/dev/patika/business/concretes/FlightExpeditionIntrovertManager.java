package dev.patika.business.concretes;

import dev.patika.business.abstracts.FlightExpeditionService;
import dev.patika.entities.abstracts.AirLine;
import dev.patika.entities.concretes.Pegasus;
import dev.patika.entities.concretes.THY;

public class FlightExpeditionIntrovertManager implements FlightExpeditionService {
    private AirLine airLine;

    public FlightExpeditionIntrovertManager(AirLine airLine) {
        this.airLine = airLine;
    }

    @Override
    public void YemekVer(int chairNum) {
        if (airLine instanceof Pegasus)
            System.out.println("Pegasus iç uçuşlarda yemek vermez.");
        else
            System.out.println("Afiyet olsun!");
    }
}
