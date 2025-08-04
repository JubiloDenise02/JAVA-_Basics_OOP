public class PolarBear extends Mammal{
    public PolarBear(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Huff!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Polar Bear - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}
