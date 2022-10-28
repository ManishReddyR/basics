import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String see =scan.nextLine();

        if(see.equals("yes")){
            System.out.println("Great!");
            System.out.println("Choose rock or paper or scissors");
            String uChoice=scan.nextLine();
            String cChoice=computerChoice();
            String result=gResult(uChoice, cChoice);
            rprint(uChoice, cChoice, result);
        }else{
            System.out.println("Thank you");
        }
        scan.close();
    }

    public static String computerChoice(){
        double rnum=Math.random()*3;
        int num = (int)rnum;
        if(num==0){
            return "rock";
        }
        else if(num==1){
            return "paper";
        }
        else if(num==3){
            return "sicissors";
        }
        return " ";
    }

    public static String gResult(String uChoice ,String cChoice) {
        if(uChoice.equals("rock")&&cChoice.equals("sicssors")){
            return("you win");
        }else if(uChoice.equals("paper")&&cChoice.equals("rock")){
            return("you win");
        }else if(uChoice.equals("sicissors")&&cChoice.equals("paper")){
            return("you win");
        }else if(uChoice.equals("sicissors")&&cChoice.equals("rock")){
            return("you loose");
        }else if(uChoice.equals("rock")&&cChoice.equals("paper")){
            return("you loose");
        }else if(uChoice.equals("paper")&&cChoice.equals("sicissors")){
            return("you loose");
        }else{
            return("Its a tie");
        }
        
    }
    public static void rprint(String uChoice , String cChoice , String result){
        System.out.println("You choose " + uChoice);
        System.out.println("Computer choose " + cChoice);
        System.out.println("Result is " + result);
    }
}
