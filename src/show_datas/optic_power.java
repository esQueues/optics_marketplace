package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class optic_power implements show_data {

    public void showData(Connection conn){
        try {
            Statement statement= conn.createStatement();
            String query="SELECT DISTINCT power FROM glasses";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                double power=rs.getDouble("power");
                System.out.println("^"+power);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}