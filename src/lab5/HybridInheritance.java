package lab5;

/* Write a Java program to demonstrate hybrid inheritance */

public class HybridInheritance {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Entity ent[] = {new Boy(), new Girl()};
    }
}

class Entity {
    Entity(){
        System.out.println("I exist");
    }
}

class Person extends Entity {
    Person(){
        System.out.println("I also live");
    }
}

class Boy extends Person{
    Boy(){
        System.out.println("But I am boy");
    }
}

class Girl extends Person {
    Girl(){
        System.out.println("But I am a girl");
    }
}
