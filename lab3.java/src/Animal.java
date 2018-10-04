public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected Gender gender;
    public Animal (){
        age=0;
        weight=0;
        name="unknown";
        gender=null;
    }
    public Animal (String name, int age, double weight, Gender gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender=gender;
    }
    public void showInfo(){
        String s = "This animal's name is " + name + ". It is " + age + " years old and it weights " + weight + " kilos.";
        System.out.println(s);
    }
    public void doSomething (){
        System.out.println("*doesn't react*");
    }

}
