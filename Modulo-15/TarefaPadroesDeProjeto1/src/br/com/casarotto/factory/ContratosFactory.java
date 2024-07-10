package br.com.casarotto.factory;

public class ContratosFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new CorolaCar(100, "cheio", "Azul");
        } else {
            return new GolCar(80, "cheio", "branco");
        }
    }

}
