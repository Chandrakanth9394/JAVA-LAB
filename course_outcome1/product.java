package sem2;
public class product {
    String pcode;
    String pname;
    int price;
        public static void main(String[] args) {
        product p_1 = new product("A123", "TV", 2);
        product p_2 = new product("B123", "RADIO", 21);
        product p_3 = new product("C123", "DVD", 3);

        if (p_1.price <= p_3.price && p_1.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_1.pcode);
        if (p_3.price <= p_1.price && p_3.price <= p_2.price) 
            System.out.println("Lowest product ID is  : " + p_3.pcode);
        if (p_2.price <= p_3.price && p_2.price <= p_1.price) 
            System.out.println("Lowest product ID is  : " + p_2.pcode);

    }

    public product(String pcode1, String pname1, int price1) {
        pcode = pcode1;
        pname = pname1;
        price = price1;
    }

    
}

