public class Penguin extends Animal implements Walk, Swim{

    private boolean isSwimming;

    private int walkSpeed;

    private int swimSpeed;

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I had some tasty fish!");
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating tasty fish!");
    }

    @Override
    public void swimming() {
        System.out.println("I am swimming at the speed of " + swimSpeed + " mph");
    }

    @Override
    public void walking() {
        System.out.println("I am walking at the speed of " + walkSpeed + " mph");
    }

    public Penguin(String nameOfAnimal){
        super(nameOfAnimal);
    }
}
