package tech.bison.trainee2021;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHandler {
    void createNewDb() throws SQLException {
        String jdbcUrl = "jdbc:sqlite:/home/vmadmin/workspace/db/credentials.db";

        try(Connection conn = DriverManager.getConnection(jdbcUrl)) {
            if (conn != null) {
                DatabaseMetaData metaData = conn.getMetaData();
                System.out.println("DB created. Driver: " + metaData.getDriverName());
            }
        }
    }
}
