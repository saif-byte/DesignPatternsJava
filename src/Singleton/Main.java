package Singleton;

import Singleton.DatabaseConnection;

public class Main{
    public static void main(String[] args){
        DatabaseConnection db1 =  DatabaseConnection.getConnection();
        DatabaseConnection db2 =  DatabaseConnection.getConnection();
        DatabaseConnection db3 =  DatabaseConnection.getConnection();
        DatabaseConnection db4 =  DatabaseConnection.getConnection();
        DatabaseConnection db5 =  DatabaseConnection.getConnection();
        DatabaseConnection db6 =  DatabaseConnection.getConnection();
        DatabaseConnection db7 =  DatabaseConnection.getConnection();
        DatabaseConnection db8 =  DatabaseConnection.getConnection();
        DatabaseConnection db9 =  DatabaseConnection.getConnection();
        System.out.println("Database connection number for db1 is " + db1.getConnectionNumber());
        System.out.println("Database connection number for db2 is " + db2.getConnectionNumber());
        System.out.println("Database connection number for db3 is " + db3.getConnectionNumber());
        System.out.println("Database connection number for db4 is " + db4.getConnectionNumber());
        System.out.println("Database connection number for db5 is " + db5.getConnectionNumber());
        System.out.println("Database connection number for db6 is " + db6.getConnectionNumber());
        System.out.println("Database connection number for db7 is " + db7.getConnectionNumber());
        System.out.println("Database connection number for db8 is " + db8.getConnectionNumber());
        System.out.println("Database connection number for db9 is " + db9.getConnectionNumber());

    }
}