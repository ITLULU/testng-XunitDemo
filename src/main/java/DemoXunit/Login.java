package DemoXunit;

/**
 * Created by duzhe on 2018/12/18.
 *
 * @Description:
 */
public class Login {

    public static boolean isLogin = false;

    /**
     * 模拟登陆校验方法
     * @param name 用户名
     * @param pwd 密码
     * @return 登陆返回信息
     */
    public String userLogin(String name,String pwd){

        if(name == null || name.equals("") || pwd ==null || pwd.equals("")){
            System.out.println("用户名或密码为空");
            isLogin = false;
            return "用户名或密码不能为空";

        }else if (name == "admin" || name.equals("admin")){
            System.out.println("欢迎管理员登录");
            isLogin = true;
            return "欢迎管理员登录";

        }else{
            isLogin = true;
            System.out.println("欢迎用户:"+name+"登录");
            return "欢迎用户:"+name+"登录";
        }
    }
}
