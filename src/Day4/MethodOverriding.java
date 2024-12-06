package Day4;

class Animal{
 public void makeSound(){
     System.out.println("Animals make sounds");
 }
}
class Dog extends Animal{
public void makeSound(){
    System.out.println("Dogs Bark");
}
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();

        Dog dog=new Dog();
        dog.makeSound();

        Cat cat=new Cat();
        cat.makeSound();


    }
}

