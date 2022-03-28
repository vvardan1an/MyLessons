package HomeWorkAbstractClass;

public abstract class Animal {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Vseda interes nablyudat kak spyat ribi ");
    }

    abstract void swim();
}
class Mechenosec extends Fish{
    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void swim() {
        System.out.println("Mechenosec bistro plavaet");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec est obichni korm");
    }
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}
class Pingvin extends Bird{
    public Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug kdrugu");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne umeyut letat.");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println("Somebody speaks");
    }
}
class Lev extends Mammal{
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev kak lyuboi xishnik lyubit myaso");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev eto ne samaya bistraya koshka");
    }
}

interface Speakable {
    void speak();
}
