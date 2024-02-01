package OOP.seminar1;

public class Parrot extends Animal{
    @Override
    public void swim() {
        System.out.println(getType() + " не плавает");
    }  
}
