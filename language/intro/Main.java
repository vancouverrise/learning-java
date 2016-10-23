/**
 * Created by iexcept on 25-Sep-16.
 */
public class Main {

    public static void main(String[] args) {
        Car bmwX3 = new Car();
        Car bmwX6 = new Car();


        bmwX3.millage = 0;
        bmwX3.color = 0xFFFFFF;

        /*init(bmwX3);

        method_drive_10km(bmwX3);

        print_car_info(bmwX3);*/

        System.out.println(bmwX3.millage);
    }

    private static void init(Car bmwX3) {
        bmwX3.millage = 0;
        bmwX3.color = 0xFFFFFF;
    }

    private static void print_car_info(Car car) {
        System.out.println(car.millage);
        System.out.println(car.color);
    }

    private static void method_drive_10km(Car car) {
        car.millage += 10_000;
    }
}


class Car {
    int millage;
    int color;
}