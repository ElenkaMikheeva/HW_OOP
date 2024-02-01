package OOP.seminar1;

public class Owl extends Animal{
    @Override
    public void swim() {
        System.out.println(getType() + " не плавает");
    }  
    @Override
    public void toGo() {
        System.out.println(getType() + " не бегает");
    } 
}
