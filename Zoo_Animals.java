public abstract class Zoo_Animals{
    private String animal_name;
    private int animal_age;
    private String animal_gender;

    public Zoo_Animals(String animal_name, int animal_age, String animal_gender){
        this.animal_name = animal_name;
        this.animal_age = animal_age;
        this.animal_gender = animal_gender;
    }

    public abstract void speak();

    public abstract void displayInfo();
    
    // For Getters and setters //
    public String getAnimalName(){
        return animal_name;
    }

    public void setAnimalName(String animal_name){
        this.animal_name = animal_name;
    }

    public int getAnimalAge(){
        return animal_age;
    }

    public void setAnimalAge(int animal_age){
        this.animal_age = animal_age;
    }

    public String getAnimalGender(){
        return animal_gender;
    }

    public void setAnimalGender(String animal_gender){
        this.animal_gender = animal_gender;
    }
}