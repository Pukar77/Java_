package Java_assignment;

import java.util.Scanner;;

public class Student {
    int roll_no;

    public void read_roll(int roll_no) {
        this.roll_no = roll_no;
    }

    public void display_roll() {
        System.out.println("Your roll no is " + roll_no);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.read_roll(13);
        obj.display_roll();
    }

}

class Test extends Student {

    int sub1_marks;
    int sub2_marks;

    public void read_marks(){

        Scanner scanner_obj = new Scanner(System.in);
        System.out.println("Enter the marks of first subject");
        sub1_marks = scanner_obj.nextInt();

        System.out.println("Enter the marks of second subject");
        sub2_marks = scanner_obj.nextInt();

    }

    public void display_marks(){
        System.out.println("The marks of first subject is "+ sub1_marks);
        System.out.println("The marks of second subject is "+ sub2_marks);
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.read_marks();
        obj1.display_marks();
    }



}
