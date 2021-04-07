public class UserDAO {
    private DBUtil db;
    public UserDAO(DBUtil db){
        this.db = db;
    }
    public boolean findUser(String userName,String userPassword){
        db.getConnection();  //连接数据库
        if((userName == "root")&&(userPassword == "123456")){
            System.out.println("登陆成功!");
            return true;
        }
        else{
            System.out.println("sorry,用户名或密码错误");
            return false;
        }

    }
}
