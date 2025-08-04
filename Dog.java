public class Dog extends Mammal{
    public Dog(String animal_name, int animal_age, String animal_gender) {
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}