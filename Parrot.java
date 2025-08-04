public class Parrot extends Bird{
    public Parrot(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Squawk!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Parrot - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}