public class Circle implements Figure {
    private double r;

    public Circle(double r)
    {
        this.r=r;
    }

    @Override
    public double getArea(){
        double area= 3.14*r*r;
        return area;
    }

    @Override
    public double getPerimeter(){
      double perimeter = 3.14*r*2;
      return perimeter;
    }

    @Override
    public String getType(){
        String type="Circle";
        return type;
    }


}
