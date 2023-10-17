package test;

/**
 * @author 1ommy
 * @version 17.10.2023
 */
public class Animal {
    protected String name;
    protected String age;
    protected int weight;
    protected int height;


    public static void pukpuk() {
        System.out.println("pukpuk");
    }
    /*
    переменные в классе называются полями
    1) public - поле или функция видны везде
    2) default - то есть ничего не написано слева, видно только внутри папочки (условно внутри тест)
    3) private - видно только внутри самого себя
    4) protected - видно только внутри себя и моих детей
     */

    public Animal() {

    }

    public Animal(String name, String age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String sayHello() {
        return "Hello";
    }
}
