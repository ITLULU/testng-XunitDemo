package DemoXunit;

/**
 * 
 * @author Administrator
 *
 */
public class Shopping {

    Login login = new Login();
    Products pro;

    /**
     * ͨ��ID������Ʒ�۸�
     * @param proId ��ƷID
     * @return ��Ʒ�۸� �� -1 û�д���Ʒ��-2 δ��¼
     */
    public int getPrice(int proId){
        if(login.isLogin == true){
            if (proId <= 0 ){ //1
                return -1;
            }else{
                Products p= Products.getPro(proId);
                System.out.println("��Ʒ��"+getPro(proId)+"  �۸�"+p.getPrice());
                return p.getPrice();
            }
        }else{

            return -2;
        }
    }


    /**
     * �жϿ��������������Ʒ
     * @param proId
     * @param count ��������
     * @return 0 ��治�㣻 1 ����ɹ���-1 δ��¼��
     */
    public int buy(int proId, int count){
        if(login.isLogin == true){
            pro = getPro(proId);
            int proCount = pro.getCount();
            System.out.println("��Ʒ��"+getPro(proId)+"  ������"+proCount);
            if(proCount > count ){  //
                pro.setCount(proCount - count );
                return 1;
            }else{
                return 0;
            }
        }else{
            return -1;
        }
    }

    /**
     * ͨ��ID��ȡ��Ʒ��Ϣ
     * @param proId
     * @return ��Ʒ��Ϣ
     */
    public Products getPro(int proId){


            if (proId <= 0) {

                return null;
            } else {
                return Products.getPro(proId);
            }

    }


    /**
     * buy����ȷ�򿪷�ʽ
     * @param proId
     * @param count
     * @return  -2 δ��¼��-1 ��������<=0��1 ����ɹ�; 0 ��治��
     */
    public int buys(int proId, int count) {
        if (login.isLogin == false) {
            return -2;
        } else{
                //�����������Ƿ����0
                if (count <= 0) {
                    return -1;
                }

            pro = getPro(proId);
            int proCount = pro.getCount();

            //����ӯ�����Թ���
            if (proCount >= count) {
                //����ɹ������ٶ�Ӧ��������ҿ�����Ϊ0
                if ((proCount - count) >= 0) {
                    pro.setCount(proCount - count);
                } else {
                    pro.setCount(0);
                }
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args){
        Shopping shopping = new Shopping();
        Login login = new Login();
        login.userLogin("admin","123456");
        System.out.print(shopping.getPrice(1));
    }

}
