package web.model;

public class Car {
    String name;
    String color;
    int speed;

    public Car(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + name +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
