package Data;

import org.testng.annotations.DataProvider;

/**
 * 
 * @author Administrator
 *
 */
public class GenrateData {

    @DataProvider
    public Object[][] getUsers(){
        return new Object[][]{
                {"","","�û��������벻��Ϊ��"},
                {"login","","�û��������벻��Ϊ��"},
                {"","123456","�û��������벻��Ϊ��"},
                {"admin","admin","��ӭ����Ա��¼"},
                {"","","�û��������벻��Ϊ��"},
                {"login","123456","��ӭ�û�:login��¼"}
        };
    }

    //-2 δ��¼��-1 ��������<=0��1 ����ɹ�; 0 ��治��
    @DataProvider
    public Object[][] getProducts(){
        return new Object[][]{
                {1,1,0},
                {2,0,-1},
                {2,1,1},
                {3,10,0}
        };
    }
    /**
     * �õ���Ʒ�۸�
     */
    @DataProvider(name="getProPrice")
    public Object[][] getProPrice() {
    	 return new Object[][]{
             {1,200},
             {2,120},
             {3,80}
     };
    }

    /**
     * �û�&��Ʒ��������
     * @return{�û���,����,Ԥ�ڵ�¼���,��ƷID,��������,Ԥ�ڹ�����}
     */
    @DataProvider
    public Object[][] getUsersAndPros(){
        return new Object[][]{
                {"","","�û��������벻��Ϊ��",1,1,-2},
                {"login","123456","��ӭlogin",2,1,1}
        };
    }

    /**
     * �û�&��Ʒ��������
     * @return{�û���,����,Ԥ�ڵ�¼���,��ƷID,��������,Ԥ�ڹ�����}
     */
    @DataProvider
    public Object[][] getUsersAndPro3(){
        return new Object[][]{
                {"login","123456","��ӭlogin",3,1,1},
                {"login","123456","��ӭlogin",3,1,1}
        };
    }
}
