
public class Cat extends Animal{

    protected Cat(String name) {
        super(name);
    }
    public static Animal create(String name) throws AnimalNameException{
        if (name == null || name.length() < 3)
            throw new AnimalNameException("Некорректное имя котика: ", name);
        return new Animal(name);
    }
    public void run(int distance) throws AnimalRunException{
        if (distance < 50){
            //TODO:  Животное хорошо бегает
        }
        else {
            throw new AnimalRunException("Котику тяжело бежать", name, distance);
        }
    }
    public void jump(int high) throws AnimalJumpException{
        if (high > 1) {
            //TODO:  Животное хорошо прыгает
        }
        throw new AnimalJumpException("Животное не умеет плавать", name, high);
    }
}
