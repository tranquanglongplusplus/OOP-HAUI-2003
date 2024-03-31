/*
    demo overload
 */
public class Cat extends Animal implements Action{

    private String type;

    public Cat (){};

    public Cat (String type){
        this.type = type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public void eat() {
        System.out.println("fish");
    }

    @Override
    public void makeNoise(){
        System.out.println("meo meo ngoao");
    }

    @Override
    protected void move() {
        super.move();
        System.out.println("leo, nhay");
    }

    @Override
    public String catchMouse() {
        return null;
    }
}
