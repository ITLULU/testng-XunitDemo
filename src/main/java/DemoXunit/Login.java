package DemoXunit;

/**
 * Created by duzhe on 2018/12/18.
 *
 * @Description:
 */
public class Login {

    public static boolean isLogin = false;

    /**
     * ģ���½У�鷽��
     * @param name �û���
     * @param pwd ����
     * @return ��½������Ϣ
     */
    public String userLogin(String name,String pwd){

        if(name == null || name.equals("") || pwd ==null || pwd.equals("")){
            System.out.println("�û���������Ϊ��");
            isLogin = false;
            return "�û��������벻��Ϊ��";

        }else if (name == "admin" || name.equals("admin")){
            System.out.println("��ӭ����Ա��¼");
            isLogin = true;
            return "��ӭ����Ա��¼";

        }else{
            isLogin = true;
            System.out.println("��ӭ�û�:"+name+"��¼");
            return "��ӭ�û�:"+name+"��¼";
        }
    }
}
