import java.sql.*;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Connection conn = DatabaseConfig.getConnection();

        int choice;

        do {
            System.out.println("\n===== TASK MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Retrieve Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    String sql = "INSERT INTO tasks(title, description) VALUES (?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    pstmt.setString(1, title);
                    pstmt.setString(2, description);

                    int rows = pstmt.executeUpdate();

                    if (rows > 0)
                        System.out.println(" Task added successfully!");
                    else
                        System.out.println("Failed to add task.");

                    pstmt.close();
                    break;
                }

                case 2 : {
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

//                    System.out.print("Enter description: ");
//                    String descriptionToRetrive = sc.nextLine();

                    String sql = "SELECT * FROM tasks WHERE title = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    pstmt.setString(1, title);
                    //pstmt.setString(2, descriptionToRetrive);

                    pstmt.close();
                }

                case 3 : {
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

//                    System.out.print("Enter description: ");
//                    String descriptionToRetrive = sc.nextLine();

                    String sql = "DELETE FROM tasks WHERE id = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    pstmt.setString(1, title);
                    //pstmt.setString(2, descriptionToRetrive);

                    pstmt.close();
                }

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        conn.close();
        sc.close();
    }
}