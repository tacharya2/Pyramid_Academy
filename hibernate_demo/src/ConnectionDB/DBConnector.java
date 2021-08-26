package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    public static void main(String[] args) {
        String db =  "jdbc:mysql://localhost:3306/hb_student_tracker ? useSSL = false & serverTimezone = UTC";
        String username = "hbstudent";
        String password = "hbstudent";

        try{
            Connection connection = DriverManager.getConnection(db, username,password);
            System.out.println("Connection Successful!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
