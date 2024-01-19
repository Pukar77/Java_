
import java . util . Scanner;
public class odd_even_userinput {

static int number;    

public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    takeinput(obj);
    check();
}

//Function to take input from user
static void takeinput(Scanner obj){
    System.out.println("Enter the number");
    number = obj.nextInt();

    // System.out.println(number);  This is used to display the value of userinput
}


//function to check whether the number is odd or even
static void check(){
if(number%2==0){
    System.out.println("The number is even");
}
else{
    System.out.println("The number is odd");
}
}

}
