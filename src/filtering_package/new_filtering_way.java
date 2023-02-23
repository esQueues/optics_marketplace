package filtering_package;

import filtering_package.filter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class new_filtering_way implements filter {
    public void g_filter(Connection conn, ArrayList<String> glasses){

        try {
            int len = glasses.size();
            String query = "SELECT *FROM glasses WHERE ";
            for (int i = 0; i < len; i += 2) {
                String column = glasses.get(i);
                String value = glasses.get(i + 1);
                if (value != null) {
                    query += column + " = '" + value + "' AND ";
                }
            }
            // Remove the trailing "AND" from the query
            query = query.substring(0, query.length() - 5);

            Statement statement= conn.createStatement();


            ResultSet rs=statement.executeQuery(query);

            while (rs.next()){

                int id= rs.getInt("id");
                String name=rs.getString("name");
                String brand_name = rs.getString("brend");
                String price = rs.getString("price");
                String optic_power = rs.getString("power");
                String gender = rs.getString("appointments");
                String type1 = rs.getString("type");
                String material1= rs.getString("material");
                String color1 = rs.getString("color");

                System.out.println(id+"|||"+name+"|||"+brand_name+"|||"+price+"|||" +optic_power+"|||"+gender+"|||"+type1+"|||"+material1+"|||"+color1);

            }
            System.out.println("[*if there empty WE apologize that we have not glass same that you want");
            System.out.println("but you can +glass in DEV mode*]");

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
