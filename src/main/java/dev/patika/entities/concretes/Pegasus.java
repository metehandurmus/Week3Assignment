package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.AirLine;
import dev.patika.entities.abstracts.Chair;

import java.util.List;

public class Pegasus extends AirLine {
    public Pegasus(List<Chair> chairList) {
        super(chairList);
    }
}
