public class Fox extends Animal implements Action{
    @Override
    public void eat() {
        System.out.println("pig bone");
    }

    @Override
    public void makeNoise(){
        System.out.println("gau gau");
    }

    @Override
    protected void move() {
        super.move();
        System.out.println("chay, boi");
    }

    @Override
    public String catchMouse() {
        return "bat chuot o dong";
    }
}
