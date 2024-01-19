public class interest {

    static int rate = 2000;
    static int principle = 100000;
    static int time = 2;

    static float interest;

    public static void main(String[] args) {

        calculate();

    }

    static void calculate() {
        interest = (rate * principle * time) / 100;
        System.out.println("Your simple interest is " + interest);
    }

}




