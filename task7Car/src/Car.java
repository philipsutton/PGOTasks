public class Car extends Vechicle {

    protected int seatNumber;

    public Car (int seatNumber){
        this.seatNumber=seatNumber;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    @Override

    public void start(){
        System.out.println("startOverrode");
    }
    @Override
    public void stop(){
        System.out.println("stopOverrode");
    }
}
