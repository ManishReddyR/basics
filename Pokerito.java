import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("There are two players, you and the computer.\n");
        System.out.println("The dealer will give each player one card.\n");
        System.out.println("Then, the dealer will draw five cards (the river)\n");
        System.out.println("The player with the most river matches wins!\n");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("\n");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine();

        String yourcard=randomCard();
        String computercard=randomCard();
        System.out.println("Here is your card" + yourcard);
        System.out.println("Here is compter card" + computercard);

        int yourMatches = 0;
        int computerMatches =0;

        for(int i=0;i<=5;i++){
            scan.nextLine();
            String draw=randomCard();
            System.out.println("card" + i + " is");
            System.out.println(draw);
            if(yourcard.equals(draw)){
                yourMatches++;
            }
            if(computercard.equals(draw)){
                computerMatches++;
            }
        }

        System.out.println("your number matches are" + yourMatches);
        System.out.println("computer number matches are " + computerMatches);

        if(yourMatches>computerMatches){
            System.out.println("You win!");
        }else if(computerMatches>yourMatches){
            System.out.println("computer wins");
        }else{
            System.out.println("everyone wins");
        }

         scan.close();
    }

    public static String randomCard(){
        double rnum=(Math.random()*13)+1;
        int num=(int)rnum;
        switch(num){
            case 1:
            return("   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n");
          
            case 2:
            return("  _____\n"+              
                  "  |2    |\n"+ 
                  "  |  o  |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____Z|\n");
                
            case 3:
            return(" _____\n" +
                 "  |3    |\n"+
                 "  | o o |\n"+
                 "  |     |\n"+
                 "  |  o  |\n"+
                 "  |____E|\n");
            case 4:
            return( " _____\n" +
                  "  |4    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  | o o |\n"+
                  "  |____h|\n");
            case 5:
            return(" _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n");

            case 6:
            return( " _____ \n" +
                  "  |6    |\n" +
                  "  | o o |\n" +
                  "  | o o |\n" +
                  "  | o o |\n" +
                  "  |____6|\n");

            case 7:
            return( " _____ \n" +
                  "  |7    |\n" +
                  "  | o o |\n" +
                  "  |o o o|\n" +
                  "  | o o |\n" +
                  "  |____7|\n");
            case 8:
            return(" _____ \n" +
                 "  |8    |\n" +
                 "  |o o o|\n" +
                 "  | o o |\n" +
                 "  |o o o|\n" +
                 "  |____8|\n");
            case 9:
            return(" _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n");

            case 10:
            return(" _____ \n" +
                 "  |10  o|\n" +
                 "  |o o o|\n" +
                 "  |o o o|\n" +
                 "  |o o o|\n" +
                 "  |___10|\n");
            case 11:
            return( " _____\n" +
                 "  |J  ww|\n"+ 
                 "  | o {)|\n"+ 
                 "  |o o% |\n"+ 
                 "  | | % |\n"+ 
                 "  |__%%[|\n");
            case 12:
            return("_____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n");
            case 13:
            return("_____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n");
                default: return null;

        }
    }
}
