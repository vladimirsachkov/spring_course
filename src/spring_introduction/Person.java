package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person bean is created");
    }

    //setPet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
