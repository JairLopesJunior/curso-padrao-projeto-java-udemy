package br.com.cod3r.factory.pratica.car;

import br.com.cod3r.factory.pratica.car.factory.CarSimpleFactory;
import br.com.cod3r.factory.pratica.car.model.Car;

public class Main {

    public static void main(String[] args) {

        Car car = CarSimpleFactory.createCar("Golf");

        System.out.println(car);
    }
}
