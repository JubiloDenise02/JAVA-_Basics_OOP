public class Eagle extends Bird{
    public Eagle(String animal_name, int animal_age, String animal_gender){
        super(animal_name, animal_age, animal_gender);
    }

    @Override
    public void speak(){
        System.out.println("Screem!");
    }

    @Override
    public void displayInfo(){
        System.out.println("Eagle - Name: " + getAnimalName() + ", Age: " + getAnimalAge() + ", Gender: " + getAnimalGender());
    }
}