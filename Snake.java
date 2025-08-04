public class Snake extends Reptile{
    public Snake(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Hiss!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Snake - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}