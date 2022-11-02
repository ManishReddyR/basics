import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    static Process process = new Process();
    static Machine machine = new Machine();

    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        try {
            loadItems("ITEM.txt");
            System.out.println("ITEMS LOADED\n\n");
            System.out.println(process);
            manageItems();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nProcess Complete.");
        }

    }

    public static void manageItems() {
        // List<Item> itemsList = new ArrayList<>();
        // itemsList.add(new Item("Pepsi", 1.99, 3));
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nWould you like to \n\ta) add\n\tb) purchase.");
            String response = scan.next();
            if (!(response.equals("a") || response.equals("b"))) {
                break;
            }
            if (response.equals("a")) {
                System.out.println("Enter the item which you want to add : ");
                Item item = new Item();
                item.setName(scan.next());
                item.setPrice(scan.nextDouble());
                item.setQuantity(scan.nextInt());
                process.addItem(item);
            }

            if (response.equals("b")) {
                while (true) {
                    System.out.println(process);

                    System.out.println("Options: \n\ta) Add to cart\n\tb) Remove from cart \n\tc) Checkout");
                    String response1 = scan.next();

                    if (!(response1.equals("a") || response1.equals("b") || response1.equals("c"))) {
                        break;
                    }
                    if (response1.equals("a")) {
                        System.out.println("Enter the item which you want to add : ");
                        int iname = scan.nextInt();
                        Item item = machine.getItem(iname);
                        if (!(process.add(item))) {
                            System.out.println(item.getName() + " is already in your shopping cart.");
                        } else {
                            System.out.println(item.getName() + " was added to your shopping cart.");
                        }
                    }

                    if (response1.equals("b")) {
                        System.out.println("Enter the item which you want to remove : ");
                        String aitem = scan.nextLine();
                        process.remove(aitem);
                    }

                    if (response1.equals("c")) {
                        process.checkout();
                    }

                    System.out.println("\n\n CART\n\n" + process);
                    System.out.print("Enter anything to continue: ");
                    scan.nextLine();

                }
            }

        }
        scan.close();
    }

    public static void loadItems(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        String[] record;
        while (scanFile.hasNextLine()) {
            record = scanFile.nextLine().split(",");
            Item item = new Item(record[0], Double.parseDouble(record[1].trim()), Integer.parseInt(record[2].trim()));
            process.addItem(item);
        }
        scanFile.close();
    }

}
