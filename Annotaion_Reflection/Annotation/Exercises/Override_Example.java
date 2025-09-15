import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String sound;

    Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: " + sound);
    }
}

public class Override_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for dog's sound
        System.out.print("Enter the sound your dog makes: ");
        String dogSound = sc.nextLine();

        Animal myDog = new Dog(dogSound); // Polymorphism
        myDog.makeSound();

        sc.close();
    }
}
