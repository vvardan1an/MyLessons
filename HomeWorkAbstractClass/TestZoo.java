package HomeWorkAbstractClass;

public class TestZoo {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenosec");
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();
        Speakable speakable = new Pingvin("Pingu");
        speakable.speak();
        Animal animal = new Lev("Lion");
        animal.eat();
        animal.sleep();
        Mammal mammal = new Lev("Lion 2");
        mammal.run();
        mammal.speak();
        mammal.eat();
        mammal.sleep();


    }
}

