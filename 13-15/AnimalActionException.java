public abstract class AnimalActionException extends AnimalNameException{
    private final int distance;
    private final int high;

    public int getHigh() {
        return high;
    }

    public int getDistance() {
        return distance;
    }

    public AnimalActionException(String message, String name, int distance) {
        super(message, name);
        this.distance = distance;
    }

    public AnimalActionException(String message, String name, int high) {
        super(message, name);
        this.high = high;
    }
}