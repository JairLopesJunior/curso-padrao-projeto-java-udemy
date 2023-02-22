package br.com.cod3r.factory.pratica.car.factory;

import br.com.cod3r.factory.pratica.car.model.Car;
import br.com.cod3r.factory.pratica.car.model.Gol;
import br.com.cod3r.factory.pratica.car.model.Golf;

import java.util.HashMap;
import java.util.Map;

public class CarSimpleFactory {

    public static Car createCar(String name) {
        return getCar(name);
    }

    private static Car getCar(String name) {
        Map<String, Car> cars = new HashMap<>();
        cars.put("Gol", new Gol());
        cars.put("Golf", new Golf());
        for(String car: cars.keySet()) {
            if(car.equals(name)) {
                return cars.get(car);
            }
        }
        return null;
    }
}
