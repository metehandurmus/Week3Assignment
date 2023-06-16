package dev.patika.entities.concretes;

import dev.patika.core.utilities.enums.FlightType;
import dev.patika.core.utilities.helpers.FlightExpeditionHelper;
import dev.patika.entities.abstracts.AirLine;

import java.util.Date;

public class FlightExpedition {
    private Date date;
    private AirLine airLine;
    private FlightType flightType;

    private FlightExpeditionHelper flightExpeditionHelper;

    public FlightExpedition(Date date, AirLine airLine, FlightType flightType, FlightExpeditionHelper flightExpeditionHelper) {
        this.date = date;
        this.airLine = airLine;
        this.flightType = flightType;
        this.flightExpeditionHelper = flightExpeditionHelper;
    }

    public Date getDate() {
        return date;
    }

    public AirLine getAirLine() {
        return airLine;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    @Override
    public String toString() {
        return date + " tarihli uçuşun tipi: " +
                flightExpeditionHelper.DetermineFlightType(this.flightType) +
                " - Hava Yolu Şirketi: " +
                flightExpeditionHelper.DetermineAirlineType(this.airLine);
    }

}
