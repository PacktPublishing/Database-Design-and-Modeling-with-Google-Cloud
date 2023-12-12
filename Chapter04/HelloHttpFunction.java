import java.io.BufferedWriter;
import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.common.collect.ImmutableList;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

/* Class HelloHttpFunction starts here and it implements the interface HttpFunction*/
public class HelloHttpFunction implements HttpFunction {
    /* Declare the static and final variables for instance connection name, user, password, 
    and database and replace them with your values. You can get the instance connection name 
    from the Cloud SQL Instance Overview page.
    */
    private static final String INSTANCE_CONNECTION_NAME = "<<your_project_name>>:<<region>>:<<instance-name>>";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "<<your_password>>";
    private static final String DB_NAME = "test_db";
    private static final String INSTANCE_UNIX_SOCKET = null;
    private HikariDataSource connectionPool;
    
    /* Class HelloHttpFunction starts here and it implements the interface HttpFunction*/
    public class HelloHttpFunction implements HttpFunction {

        private static final String INSTANCE_CONNECTION_NAME = "<<your_project_name>>:<<region>>:<<instance-name>>";
        private static final String DB_USER = "root";
        private static final String DB_PASS = "<<your_password>>";
        private static final String DB_NAME = "test_db";
        private static final String INSTANCE_UNIX_SOCKET = null;
        private HikariDataSource connectionPool;
        
        /* The service method starts here and it has 2 arguments - HttpRequest object and HttpResponse object
        It establishes the connection to the Cloud SQL MySQL instance*/
        public void service(final HttpRequest request, final HttpResponse response) throws Exception {
            final BufferedWriter writer = response.getWriter();
            String jdbcURL = String.format("jdbc:mysql:///%s", DB_NAME);
            Properties connProps = new Properties();
            connProps.setProperty("user", DB_USER);
            connProps.setProperty("password", DB_PASS);
            connProps.setProperty("socketFactory", "com.google.cloud.
                sql.mysql.SocketFactory ");
                connProps.setProperty("cloudSqlInstance", INSTANCE_ CONNECTION_NAME);
                
                /* Initialize connection pool */
                HikariConfig config = new HikariConfig(); config.setJdbcUrl(jdbcURL); config.setDataSourceProperties(connProps); config.setConnectionTimeout(10000); // 10s
                this.connectionPool = new HikariDataSource(config); String result = "";
                
                /* This part of the function invokes the DB connection. It stores the SELECT query 
                in a variable called query and invokes the Prepared Statement.
                The result is stored in a variable and returned to the BufferedWriter object. */
                try (Connection conn = connectionPool.getConnection()) {
                    // PreparedStatements can be more efficient and project
                    against injections.
                    String query = "select string_column from test_db.test_
                    table where index_column = 1;
                    ";
                    PreparedStatement pStmt = conn.prepareStatement(query);
                    ResultSet rs = pStmt.executeQuery();
                    while (rs.next()) {
                
                        //Set values from result
                        result = rs.getString("string_column");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException("Unable to process. Run Time Error in Select.", ex);
                }
                writer.write("Hello! " + result);
            }
        }
    }
