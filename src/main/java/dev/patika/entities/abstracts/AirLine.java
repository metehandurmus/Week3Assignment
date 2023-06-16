package dev.patika.entities.abstracts;

import java.util.List;

public abstract class AirLine {
    List<Chair> chairList;

    public AirLine(List<Chair> chairList) {
        this.chairList = chairList;
    }

    public List<Chair> getChairList() {
        return chairList;
    }
}