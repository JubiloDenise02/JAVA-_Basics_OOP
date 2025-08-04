public class Woodpecker extends Bird{
    public Woodpecker(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Peek!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Woodpecker - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}