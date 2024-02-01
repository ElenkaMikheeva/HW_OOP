package OOP.seminar1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        System.out.println(cat.getName());
        Animal animal = new Animal();
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
       Animal dog = new Dog("Персик", LocalDate.of(2020, 02, 10), new Illness("Лишай"));
        System.out.println(dog.getType());
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020, 02, 10), new Illness("Лишай"), 2));
        System.out.println(list);
        dog.lifeCycle();

        Animal hamster = new Hamster();
        hamster.toGo();
        hamster.swim();
        hamster.fly();

        Animal owl = new Owl();
        owl.toGo();
        owl.swim();
        owl.fly();

        Animal parrot = new Parrot();
        parrot.toGo();
        parrot.swim();
        parrot.fly();

        Animal penguin = new Penguin();
        penguin.toGo();
        penguin.swim();
        penguin.fly();
    }
}
