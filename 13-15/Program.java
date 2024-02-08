public class Program {
    public static void main(String[] args) {

        try{
            Cat cat1 = new Cat("Вася");
            cat1.swim(10);
            cat1.run(10);
        }catch (AnimalRunException e) {
            System.out.println(e.getMessage());
        }catch (AnimalJumpException e){
            System.out.println(e.getMessage());

        }
        catch (AnimalNameException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}