package test;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class Cat extends Animal {
    private String poroda;

    public Cat(String name, String age, int weight, int height, String poroda) {
        super(name, age, weight, height);
        this.poroda = poroda;
    }

    @Override
    public String sayHello() {
        return "Привет, я Кошка";
    }
}
