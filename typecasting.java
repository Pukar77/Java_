public class typecasting {
    
    public static void main(String[] args) {
        byte b;
        int i = 355;
        double d = 423.150;
        b = (byte)i;

        System.out.println("i= " +i + "b = " + b);
        b = (byte)d;

        System.out.println("Conversion of double to byts is d= " +d + "b = " +b);
    }
}
