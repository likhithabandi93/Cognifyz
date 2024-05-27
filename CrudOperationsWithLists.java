import java.util.ArrayList;
import java.util.Scanner;

public class CrudOperationsWithLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dataList = new ArrayList<>();
        
        int choice;
        
        do {
            System.out.println("\nCRUD Operations on Data");
            System.out.println("1. Create ");
            System.out.println("2. Read ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    createData(dataList, scanner);
                    break;
                case 2:
                    readData(dataList);
                    break;
                case 3:
                    updateData(dataList, scanner);
                    break;
                case 4:
                    deleteData(dataList, scanner);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 5.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void createData(ArrayList<String> dataList, Scanner scanner) {
        System.out.print("Enter data to add: ");
        scanner.nextLine(); 
        String newData = scanner.nextLine();
        dataList.add(newData);
        System.out.println("Data added successfully!");
    }
    
    public static void readData(ArrayList<String> dataList) {
        System.out.println("\nData:");
        if (dataList.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (String data : dataList) {
                System.out.println(data);
            }
        }
    }
    
    public static void updateData(ArrayList<String> dataList, Scanner scanner) {
        if (dataList.isEmpty()) {
            System.out.println("List is empty! No data to update.");
        } else {
            System.out.print("Enter index of data to update: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < dataList.size()) {
                System.out.print("Enter new data: ");
                scanner.nextLine(); 
                String updatedData = scanner.nextLine();
                dataList.set(index, updatedData);
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("Invalid index!");
            }
        }
    }
    
    public static void deleteData(ArrayList<String> dataList, Scanner scanner) {
        if (dataList.isEmpty()) {
            System.out.println("List is empty! No data to delete.");
        } else {
            System.out.print("Enter index of data to delete: ");
            int deleteIndex = scanner.nextInt();
            if (deleteIndex >= 0 && deleteIndex < dataList.size()) {
                dataList.remove(deleteIndex);
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Invalid index!");
            }
        }
    }
}
