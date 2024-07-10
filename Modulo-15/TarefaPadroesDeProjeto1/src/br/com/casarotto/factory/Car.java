package br.com.casarotto.factory;

public abstract class Car {

    private int horsePower;
    private String fuelSource, color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("O tanque está " + fuelSource + " e está pronto para uso " + horsePower + "\n");
    }

    public void clean() {
        System.out.println("\nO carro foi lavado  e o " + color.toLowerCase() + " da pintura está brilhando!" + "\n");
    }

    public void mechanicCheck() {
        System.out.println("O motor parece estar em bom estado, nenhuma irregularidade encontrada" + "\n");
    }

    public void fuelCar() {
        System.out.println("O carro está sendo abastecido e está com o tanque " + fuelSource.toLowerCase() + "\n");
    }
}
