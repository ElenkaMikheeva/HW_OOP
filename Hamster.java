package OOP.seminar1;

public class Hamster extends Animal{
    @Override
    public void fly() {
        System.out.println(getType() + " не летает");
    }
}
