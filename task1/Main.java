package task1;

public class Main {

    public static void main(String[] args) {

Phone samsungPhone = new Phone ("Samsung", 15, "123456789");
        samsungPhone.sendMessage("Hello", 123456789);

        System.out.println();
        System.out.println();

Car toyotaCar= new Car ("White", "Toyota", 1.6);

toyotaCar.carInfoDisplay("White", "Toyota", 1.6);

        System.out.println();
        System.out.println();
    

toyotaCar.setColourAndBrand("Red", "Lexus");
toyotaCar.setEngineCapacity(5.0);
toyotaCar.checkEngine(5.0);


    }
}