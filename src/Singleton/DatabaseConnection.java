package Singleton;

public class DatabaseConnection {

    public static final int total_connections = 6;
    public static DatabaseConnection[] dbpool = new DatabaseConnection[total_connections];
    private static int  current_con = -1;
    private static int connection_no = 0;
    private int in_con_no = connection_no;
    private  DatabaseConnection(){

    }
    public static DatabaseConnection getConnection(){
        current_con = (current_con +1) % total_connections;
        if (connection_no < total_connections){
            synchronized (DatabaseConnection.class) {
                if (connection_no < total_connections) {
                    DatabaseConnection db = new DatabaseConnection();
                    dbpool[current_con] = db;
                    connection_no = connection_no + 1;
                }
            }

            return dbpool[current_con];

        }
        else{
            return dbpool[current_con];
        }
    }
    public int getConnectionNumber(){
        return this.in_con_no;
    }

}
