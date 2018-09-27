public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Hatiko", 3, 5, true, "Akita inu", true);

        Animal animal = new Animal("Fluff", 5, 20, true);
        animal.showInfo();
        dog1.showInfo();
        animal.doSomething();
        dog1.doSomething("voice");


    }


}
