public class Main {

    public static void main(String[] args){

        Wolf w = new Wolf();
        Dog d = new Dog();

        Lion l = new Lion();
        Cat c = new Cat();


        w.makeNoise();
        d.makeNoise();

        l.makeNoise();
        c.makeNoise();

        System.out.println();
        System.out.println();
        System.out.println();

        d.roam();
        c.roam();
    }
}
