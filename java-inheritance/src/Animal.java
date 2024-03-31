public abstract class Animal {
    private String type;

    protected void move(){
        System.out.println("move");
    }

    public abstract void eat();

    public void makeNoise(){
        System.out.println("keu");
    }
}
