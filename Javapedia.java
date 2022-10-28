import java.util.Scanner;

public class Javapedia {
    public Javapedia() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        System.out.println("how many historical places you will register");
        int places=scan.nextInt();


        String [][]bio=new String[places][3];
        scan.nextLine();
        
        for(int i=0;i<bio.length;i++){
            System.out.println("\n\t Figure" +(i+1));
            System.out.print("\t - Name: ");
            bio[i][0]=scan.nextLine();
            System.out.print("\t - Date of birth: ");
            bio[i][1]=scan.nextLine();
            System.out.print("\t - Occupation: ");
            bio[i][2]=scan.nextLine();
            System.out.print("\n");
        }
        
        System.out.println("These are the values you stored:"); 
        print2DArray(bio);

        System.out.print("\nWho's do you want information on? ");  
        String name=scan.nextLine();
        for(int i=0;i<bio.length;i++){
            if(name.equals(bio[i][0])){
                System.out.println("\t Name :" + bio[i][0]);
                System.out.println("\t date :" +bio[1][1]);
                System.out.println("\t occpation :" +bio[i][2]);
            }
    
        scan.close();
        }
    }
    public static void print2DArray(String[][] array){
        for(int i=0;i<array.length;i++){
            System.out.println("\t");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
