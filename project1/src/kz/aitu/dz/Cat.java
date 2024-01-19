package kz.aitu.dz;

import java.util.Objects;

public class Cat {
    private String name;
    private Integer weight;
    private String color;

    public Cat() {
        this.name = "";
        this.weight = 0;
        this.color = "";
    }

    public Cat(String name) {
        this();
        setName(name);
    }

    public Cat(String name, Integer weight) {
        this(name);
        setWeight(weight);
    }

    public Cat(String name, Integer weight, String color) {
        this(name, weight);
        setColor(color);
    }

    public Cat(String name, String color) {
        this(name);
        setColor(color);
    }

    public String getName() {
        System.out.println("Getter for name was called");
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name, "Name cannot be null");
        System.out.println("Setter for name was called");
        this.name = name;
    }

    public Integer getWeight() {
        System.out.println("Getter for weight was called");
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight == null) {
            throw new IllegalArgumentException("Weight cannot be null");
        }
        System.out.println("Setter for weight was called");
        this.weight = weight;
    }

    public String getColor() {
        System.out.println("Getter for color was called");
        return color;
    }

    public void setColor(String color) {
        Objects.requireNonNull(color, "Color cannot be null");
        System.out.println("Setter for color was called");
        this.color = color;
    }

    public void meow() {
        System.out.println(getName() + " says meow");
    }

    public void meow(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(getName() + " says meow");
        }
    }

    public static void main(String[] args) {
        Cat firstCat = new Cat();
        firstCat.meow();

        Cat secCat = new Cat("urazbek");
        secCat.meow();

        Cat thirdCat = new Cat("cristiano ronaldo", 5);
        thirdCat.meow();

        Cat fourthCat = new Cat("archibalt", "Orange");
        fourthCat.meow();

        Cat fifthCat = new Cat("rar", 3, "White");
        fifthCat.meow();

        fifthCat.meow(3);
    }
}
