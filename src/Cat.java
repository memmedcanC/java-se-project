public class Cat extends Animal implements Movable{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meoww!!!");
    }

    @Override
    public void move() {
        System.out.println("Cat is walking");
    }
}
