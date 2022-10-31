import java.util.Scanner;

public class Main {
 
     static Item[][] items = new Item[][] {
     { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
     { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
     { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
     };

    static Machine machine=new Machine(items);
    public static void main(String[] args) {


        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        

         System.out.println(machine);
        manageItems();
 
    }

    public static void manageItems(){
        Scanner scan= new Scanner(System.in);
        
        while (true) {
            System.out.println("\nWould you like to \n\ta) add\n\tb) purchase.");
            String response = scan.nextLine();

            if (!(response.equals("a") || response.equals("b"))) {
                scan.close();
                break;
            }
            if(response.equals("a")){
                System.out.println("Select a row :");
                int row=scan.nextInt();
                System.out.println("Select a spot :");
                int spot=scan.nextInt();
                System.out.println("Quantity added");
                int quantity=scan.nextInt();
                machine.addItem(row, spot, quantity);
                System.out.println("\n " + machine);
            }

            if(response.equals("b")){
                    System.out.println("Select a row :");
                    int row=scan.nextInt();
                    System.out.println("Select a spot :");
                    int spot=scan.nextInt();
        
                    machine.buyItem(row, spot);
                    System.out.println("\n " + machine);
                    }
        }
    }
}
