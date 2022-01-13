package se.yaffet;

public class Owl extends Animal {
    private String name;
    private int wingSpan;
    private int age;
    private int height;


    public Owl(String name, int wingSpan, int age){
        this.name = name;
        this.wingSpan = wingSpan;
        this.age = age;
    }

    public int eat(int squirrelCurrentHeight){
        this.height = squirrelCurrentHeight;
        return this.height;
    }

    @Override
    public boolean eat(Object food) {
        if (food instanceof Squirrel) {
            return true;
        }
         return false;
    }
}
