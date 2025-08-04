public class Lizard extends Reptile{
    public Lizard(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Chuck, Chuck, Chuck!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Lizard - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}