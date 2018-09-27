public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected String gender;
    public Animal (){
        age=0;
        weight=0;
        name="unknown";
        gender="n/a";
    }
    public Animal (String name, int age, double weight, boolean ifMale){
        this.name = name;
        this.age = age;
        this.weight = weight;
        if (ifMale)
            gender="male";
        else gender = "female";
    }
    public void showInfo(){
        String s = "This animal's name is " + name + ". It is " + age + " years old and it weights " + weight + " kilos.";
        System.out.println(s);
    }
    public void doSomething (){
        System.out.println("*doesn't react*");
    }

}
