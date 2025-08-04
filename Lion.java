public class Lion extends Mammal{
    public Lion(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Roar!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Lion - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}