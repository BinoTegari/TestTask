import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class Task5 {
    public static void main(String[] args) {
        ConnectToSQL connectToSQL = new ConnectToSQL();
        connectToSQL.connect();
    }
}

class ConnectToSQL {
    private String url = "jdbc:mysql://localhost:3306/dbo";
    private String username = "root";
    private String password = "root";
    private String sqlCommand = "Select count(distinct id) from dbo";


    public void connect(){
        try(
                Connection con = DriverManager.getConnection(url, username, password))
        {
            System.out.println("Подключение ок");
            Statement statement = con.createStatement();
            statement.execute(sqlCommand);
//            System.out.println("Все записано! " + rows + " строка");
            ResultSet resultset = statement.executeQuery(sqlCommand);
            int columns = resultset.getMetaData().getColumnCount();
            while(resultset.next()){
                for (int i = 1; i <= columns; i++){
                    System.out.print(resultset.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch(
                SQLException throwables)

        {
            System.out.println("С подключением что-то не задалось");
            throwables.printStackTrace();
        }
    }
}
