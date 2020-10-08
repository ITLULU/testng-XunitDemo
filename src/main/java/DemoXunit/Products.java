package DemoXunit;

/**
 * 
 * @author Administrator
 *
 */
public enum Products {
    WEIJIN(1,"围巾",200,110),
    MAOZI(2,"帽子",120,120),
    SHOUTAO(3,"手套",80,1333);

    private int proId;  //商品ID
    private String proName;  //商品名称
    private int price;  //价格
    private int count;  //库存

    private Products(int proId, String proName, int price, int count){
        this.proId = proId;
        this.proName = proName;
        this.price = price;
        this.count = count;
    }

    /**
     * 通过商品ID 获取商品信息
     * @param proId
     * @return
     */
    public static Products getPro(int proId){

        for(Products product : Products.values()){
            if(product.getProId() == proId){
                return product;
            }
        }
        return null;
    }


    /** getters and setters **/
    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public static void main(String[] args) {
		System.out.println(Products.getPro(2).getPrice());
	}
}
