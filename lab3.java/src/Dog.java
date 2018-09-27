public class Dog extends Animal {
    private String breed;
    private boolean ifGoodBoy;
    public Dog(){
        super();
        breed="n/a";
        ifGoodBoy = true;
    }
    public Dog (String name, int age, double weight, boolean ifMale, String breed, boolean ifGoodBoy){
        super(name,age,weight,ifMale);
        this.breed=breed;
        this.ifGoodBoy=ifGoodBoy;
    }

    public void showInfo(){
        String s = "This doggo's name is " + name + ". " + name + " is " + age + " years old and it weights " + weight + " kilos. ";
        if (ifGoodBoy)
            s+=name + " is a gooooood boy.";
        System.out.println(s);
    }
    public void doSomething(String command){
        if (command.equals("voice"))
            System.out.println("bork!");
    }

}
