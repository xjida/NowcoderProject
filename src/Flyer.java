public class Flyer implements addFunction{
    public String name;
    public String unit;
    public int age;

    public Flyer(String name, String unit, int age) {
        this.name = name;
        this.unit = unit;
        this.age = age;
    }

    @Override
    public void add() {
        System.out.println(String.format("%s is in %s, aged %d",name,unit,age));
    }
}
