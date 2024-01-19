import java.util.Scanner;
public class positive_negative_userinput {

static float number;
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number");
        number = obj.nextFloat();

        if(number<0){
            System.out.println("The number is negative");
        }
        else if(number>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is 0");
        }

    }
    
}
