package exercise_3;

public class Main {

    public static void main(String[] args) {
        Address a = new Address("Страна, Регион, Город, Улица, Дом, Корпус, Квартира", 1);
        System.out.println(a);
        Address b = new Address("Страна, Регион, Город, Улица, Дом, Корпус, Квартира");
        System.out.println(b);
        Address c = new Address("Страна. Регион. Город. Улица. Дом. Корпус. Квартира");
        System.out.println(c);
        Address d = new Address("Страна; Регион; Город; Улица; Дом; Корпус; Квартира");
        System.out.println(d);
    }
}
