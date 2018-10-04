public class Person {
    protected String firstName;
    protected String lastName;
    protected int yearOfBirth;
    public Person (String firstName,String lastName, int yearOfBirth){
        this.yearOfBirth=yearOfBirth;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public boolean equals (Person person){
        return (this.firstName.equals(person.firstName)&& this.lastName.equals(person.lastName)&& this.yearOfBirth==person.yearOfBirth);

    }
    public String toString (){
        return (firstName + " " + lastName);
    }
}
