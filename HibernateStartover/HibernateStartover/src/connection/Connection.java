package connection;

import java.sql.DriverManager;

public class Connection {

    public Connection(){
    }

    public static void main(String[] args) {
        // Required credential to connect to the database.
        String dbUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
        String usr = "hbstudent";
        String pasword = "hbstudent";

        try{
            DriverManager.getConnection(dbUrl, usr, pasword);
            System.out.printf("Connection Successful");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
