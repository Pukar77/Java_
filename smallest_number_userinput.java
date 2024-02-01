import java.util.Scanner;
public class smallest_number_userinput {
    
    public static void main(String[] args) {

        float num[] = new float[4];
        int i;
        System.out.println("Enter the four number");
        for(i=0;i<4;i++){
            Scanner obj = new Scanner(System.in);
            num[i] = obj.nextFloat();
        }
        float smallest = num[0];

        for(i=1;i<4;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("The smallest number is " + smallest);

    }
}
