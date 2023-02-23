package show_datas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class showing_all_data_class {
    public void show_all_glasses(Connection conn) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = "SELECT CONCAT(id, ' | ', name, ' | ', price, 'тг', ' | ', brend, ' | ', power, ' | ', appointments, ' | ', type, ' | ', material, ' | ', color) AS product_info FROM glasses";
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String product_info = rs.getString("product_info");
                System.out.println(product_info);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
