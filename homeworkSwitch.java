import java.util.Scanner;

public class homeworkSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("What grade did the assignment recieve?");
    char g ='X'; 
    int grade =  Integer.parseInt(input.nextLine());
      switch (grade/10) {
            case 1:
            case 2:
            case 3:
            case 4: g = 'F';
            break;
            case 5:
            case 6: g = 'D';
            break;
            case 7: g = 'C';
            break;
            case 8: g = 'B';
            break;
            case 9:
            case 10: g = 'A';
            break;
        }
        System.out.println("Grade student recieved: " + g);
    }

}
