package task1;

public class Car {
    String colour;
    String brand;
    double engineCapacity;
    public Car(String colour, String brand, double engineCapacity){

        this.colour = colour;
        this.brand = brand;
        this.engineCapacity = engineCapacity;


    }
    public void carInfoDisplay(String colour,String brand, double engineCapacity)
    {
        System.out.println(this.colour + " " + this.brand + " "  + this.engineCapacity);
    }

    public void setColourAndBrand (String colour, String brand)
    {
        this.colour = colour;
        this.brand = brand;
        System.out.println(colour);
        System.out.println(brand);

    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        System.out.println(engineCapacity);
    }

    public void checkEngine(double engineCapacity)
    {
        if (engineCapacity>=2.0)
            System.out.println("Fast car");
        else System.out.println("Slow car");
    }
}