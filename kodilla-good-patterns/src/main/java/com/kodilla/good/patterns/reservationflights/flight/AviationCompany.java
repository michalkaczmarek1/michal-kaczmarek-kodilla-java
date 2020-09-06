package com.kodilla.good.patterns.reservationflights.flight;

public class AviationCompany {
    private String name;

    public AviationCompany(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AviationCompany{" +
                "name='" + name + '\'' +
                '}';
    }
}
