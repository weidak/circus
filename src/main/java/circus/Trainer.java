package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);
        d2.fly();
        d2.swim();

<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Duck());
        train(new Parrot());

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> upstream/master:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
<<<<<<< HEAD:src/main/java/circus/Trainer.java

        //this check removes the error to train the wrong bird
=======
>>>>>>> upstream/master:src/main/java/Trainer.java
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
