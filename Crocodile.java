public class Crocodile extends Reptile{
    public Crocodile(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Chirp!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Crocodile - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}