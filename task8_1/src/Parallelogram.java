public class Parallelogram implements Figure {
    double base, side, height;

    public Parallelogram(double base, double side, double height){
        this.base=base;
        this.side=side;
        this.height=height;
    }

    @Override
    public double getArea(){
        double area = base*height;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 2*(base+side);
        return perimeter;
    }

    @Override
    public String getType(){
        String type = "Parallelogram";
        return  type;
    }



}
