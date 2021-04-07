public class LoginForm {
    private String userPassword;
    private UserDAO userDao;
    private String userName;
    public LoginForm(UserDAO userDAO,String userName,String userPassword){
        this.userDao = userDAO;
        this.userName = userName;
        this.userPassword = userPassword;
        this.init();
    }
    public void init(){
        System.out.println("初始化成功");
        System.out.println("显示界面");
        System.out.println("验证中");
    }
    public void validate(){
        userDao.findUser(userName,userPassword);
    }
}
