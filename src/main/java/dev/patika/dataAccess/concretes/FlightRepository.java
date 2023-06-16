package dev.patika.dataAccess.concretes;

import dev.patika.core.utilities.enums.FlightType;
import dev.patika.core.utilities.helpers.FlightExpeditionHelper;
import dev.patika.entities.abstracts.Chair;
import dev.patika.entities.concretes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FlightRepository {
    public static final List<FlightExpedition> flightExpeditionList = new ArrayList<>();

    public FlightRepository(FlightExpeditionHelper flightExpeditionHelper) {
        Date date = new Date();
        flightExpeditionList.add(new FlightExpedition(date, new THY(new ArrayList<>()), FlightType.INTROVERT, flightExpeditionHelper));
        flightExpeditionList.get(0).getAirLine().getChairList().add(new BusinessChair(120));
        flightExpeditionList.get(0).getAirLine().getChairList().add(new BusinessChair(150));
        flightExpeditionList.get(0).getAirLine().getChairList().add(new BusinessChair(300));
        flightExpeditionList.get(0).getAirLine().getChairList().add(new EcoChair(50));
        flightExpeditionList.get(0).getAirLine().getChairList().add(new EcoChair(30));

        flightExpeditionList.add(new FlightExpedition(date, new THY(new ArrayList<>()), FlightType.EXTROVERT, flightExpeditionHelper));
        flightExpeditionList.get(1).getAirLine().getChairList().add(new BusinessChair(220));
        flightExpeditionList.get(1).getAirLine().getChairList().add(new EcoChair(150));
        flightExpeditionList.get(1).getAirLine().getChairList().add(new EcoChair(130));

        flightExpeditionList.add(new FlightExpedition(date, new Pegasus(new ArrayList<>()), FlightType.INTROVERT, flightExpeditionHelper));
        flightExpeditionList.get(2).getAirLine().getChairList().add(new BusinessChair(220));
        flightExpeditionList.get(2).getAirLine().getChairList().add(new BusinessChair(350));
        flightExpeditionList.get(2).getAirLine().getChairList().add(new EcoChair(210));
        flightExpeditionList.get(2).getAirLine().getChairList().add(new EcoChair(210));

        flightExpeditionList.add(new FlightExpedition(date, new Pegasus(new ArrayList<>()), FlightType.EXTROVERT, flightExpeditionHelper));
        flightExpeditionList.get(3).getAirLine().getChairList().add(new BusinessChair(420));
        flightExpeditionList.get(3).getAirLine().getChairList().add(new EcoChair(350));
        flightExpeditionList.get(3).getAirLine().getChairList().add(new EcoChair(310));
        flightExpeditionList.get(3).getAirLine().getChairList().add(new EcoChair(320));
    }
}
