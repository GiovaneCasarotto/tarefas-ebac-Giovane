package br.com.casarotto.factory;

public class SemContratosFactory extends Factory{

    @Override
    Car retrieveCar(String requestedGrade) {        
        if ("A".equals(requestedGrade)) {
            return new CeltaCar(100, "cheio", "Vermelho");
        } else {
            return new UnoCar(80, "cheio", "cinza");
        }
    }

}
