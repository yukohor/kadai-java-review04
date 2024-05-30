package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;

    }

    public Human() {

    }

    public Human(String animalName, int animalAge, String hobby) {
        super.setAnimalName(animalName);
        super.setAnimalAge(animalAge);
        this.hobby = hobby;
    }

    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
