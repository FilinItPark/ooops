package test;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class Dog extends Animal {
    private String poroda;

    public Dog() {
    }

    public Dog(String name, String age, int weight, int height, String poroda) {
        super(name, age, weight, height);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String sayHello() {
        return "Привет, я собака";
    }
}
