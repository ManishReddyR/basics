import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String ans1=scan.nextLine();

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String ans2=scan.nextLine();

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String ans3=scan.nextLine();

        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String ans4=scan.nextLine();

        int score = 0;
        if(ans1.equals("c")){
            score+=5;
        }
        if(ans2.equals("a")){
            score+=5;
        }
        if(ans3.equals("b")){
            score+=5;
        }
        if(ans4.equals("a")){
            score+=5;
        }
        
        System.out.println("Your final score is: " + score + "/20");

        if(score>=15){
            System.out.println("wow you know stuff");
        }
        if(score<15){
            System.out.println("not bad");
        }
        if(score<=4){
            System.out.println("better luck next time");
        }

        scan.close();

    }
}