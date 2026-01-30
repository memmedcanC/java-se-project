public class Dog extends Animal implements Movable{
    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Bark!!!");
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }
}
