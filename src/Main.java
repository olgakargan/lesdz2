import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        //задание1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        double sugarWeight= 1.5;
        float salrWeight= 1.5f;
        boolean dogIsAdult = dog > 10;
        long elephant = 110L;
        char bar = 35;
        System system = null;
        out.println (bar);
        out.println (dogIsAdult);

        //задание2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllboxers = boxer1 + boxer2;
        double weightOifference = boxer2 - boxer1;
        out.println ("summa"  + weightOfAllboxers);

        out.println ("difference"  + weightOifference);

//задание3
        int banana = 5*80; //400gr
        int milk = 2 * 105; //210gr
        int iceCream= 2 * 100; //200gr
        int eggs = 4 * 70; //280gr
        int weightAll = banana + milk + iceCream + eggs;
        float weightAllRg = weightAll/1000;

        out.println ("summa"  + weightAll);
        out.println ("summa"  + weightAllRg);






    }
}