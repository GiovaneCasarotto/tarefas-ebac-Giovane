package br.com.casarotto.factory;

public abstract class Factory {

    public Car create(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }
    public Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String requestedGrade);

}
