public class App {
    public static void main(String[] args) throws Exception {

        Animal myDog = new Dog();

        Animal myCat = new Cat();

        myCat.eat();
        myCat.makeSound();
        myCat.sleep();
        System.out.println("-------------------------------------------");
        myDog.eat();
        myDog.makeSound();
        myDog.sleep();

    }
}
