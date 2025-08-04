public class Owl extends Bird{
    public Owl(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Hoot!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Owl - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}