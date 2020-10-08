import java.util.Scanner;


public class homeworkIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aLimit = 90;
        int bLimit = 80;
        int cLimit = 70;
        int dLimit = 60;
        System.out.println("What grade did the assignment recieve?");
        int grade = Integer.parseInt(input.nextLine());
        // String grade = input.nextLine();
    

        if (grade > aLimit) {
            if (grade == aLimit + 10) 
            System.out.println("Student recieved full marks!");
        
            else 
            System.out.println("Student recieved an A!");
            System.exit(0);
        
        } else {
            if (grade > bLimit) {
                System.out.println("Student recieved an B");
                System.exit(0); 
        } else {
            if (grade > cLimit) {
                System.out.println("Student recieved an C");
                System.exit(0); 
        } else {
            if (grade > dLimit) {
                System.out.println("Student recieved an D");
                System.exit(0); 
        } else { 
            System.out.println("Student recieved an F");
            System.exit(0);
        }
        }
        // System.out.printf("Assignment recived %s", grade);
       
    }
    }
}
}