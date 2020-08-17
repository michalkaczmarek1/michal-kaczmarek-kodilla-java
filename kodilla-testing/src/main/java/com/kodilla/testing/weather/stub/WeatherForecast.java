package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double averageTemperature;
    private double median;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getMedian() {
        return median;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double sum = 0;
        for(Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()) {
                sum += temperature.getValue();
        }

        averageTemperature = sum/temperatures.getTemperatures().size();

        return averageTemperature;
    }

    public double calculateMedian() {
        List<Double> numbers = new ArrayList<>();
        int centerIndex = 0;

        for(Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()) {
            numbers.add(temperature.getValue());
        }


        Collections.sort(numbers);
        centerIndex = numbers.size()/2;
        median = numbers.get(centerIndex);

        return median;
    }


}