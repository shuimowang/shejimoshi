import java.sql.Connection;

public class DBUtil {
    private Connection conn;
    //方法：getConnection 获取数据库连接对象
    public Connection getConnection(){
        System.out.println("连接数据库");
        return conn;
    }
}

