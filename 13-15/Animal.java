

public class Animal {
    protected int animalId;
    protected String name;
    protected LocalDate birthday;


    public String getName() {
        return name;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Animal(int animalId, String name, LocalDate birthday) {
        this.animalId = animalId;
        this.name = name;
        this.birthday = birthday;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public abstract void jump(int high) throws AnimalJumpException;

    public abstract void run(int distance) throws AnimalRunException;

}
