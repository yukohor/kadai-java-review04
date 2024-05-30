package animal;

public class Animal {

    private String animalName;
    private int animalAge;

    public Animal() {

    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    

    public String getanimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void say() {
        System.out.println(animalName + "です。" + animalAge + "歳です。");
    }
}
