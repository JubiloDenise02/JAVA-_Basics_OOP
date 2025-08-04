public class Elephant extends Mammal{
    public Elephant(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Trumpet!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Elephant - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}