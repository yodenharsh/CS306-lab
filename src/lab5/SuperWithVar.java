package lab5;

//Write a java program to demonstrate use of super keyword with variables

public class SuperWithVar {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        RaceCar raceCar = new RaceCar();
    }
}

class Car{
    double maxSpeed = 110;
}

class RaceCar extends Car{
    double maxSpeed = 200;
    RaceCar(){
        System.out.println("I could run at "+super.maxSpeed +"kph but because I am a race car, I run at "+maxSpeed+"kph");
    }
}