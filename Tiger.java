public class Tiger extends Animal implements Walk{


    @Override
    public void eatingCompleted() {

    }
    private int numberOfStripes;

    private int speed;

    private int soundLevelOfRoar;

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSoundLevelOfRoar(int soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    public Tiger(String nameOfAnimal) {
        super(nameOfAnimal);
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed of " + speed + " mph");
    }
}
