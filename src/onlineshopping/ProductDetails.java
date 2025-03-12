package onlineshopping;

public class ProductDetails {

	public Order[] orderdetails()
	{
		Order o=new Order();
		o.setOid(1);
		o.setOname("abc");
		o.setDate("2 april");
		
		Order o1=new Order();
		o1.setOid(2);
		o1.setOname("def");
		o1.setDate("3 april");
		Order o2=new Order();
		o2.setOid(3);
		o2.setOname("ghi");
		o2.setDate("4 april");
		
		Order [] arr= {o,o1,o2};
		
		
		return arr;
	}
	
	public Product[] productdetails()
	{
		Product p=new Product();
		p.setPid(11);
		p.setPname("ABC");
		p.setPrice(78.00);
		Product p1=new Product();
		p1.setPid(11);
		p1.setPname("DEF");
		p1.setPrice(34.00);
		Product p2=new Product();
		p2.setPid(11);
		p2.setPname("GHI");
		p2.setPrice(65.00);
		
		Product []arr1= {p,p1,p2};
		return arr1;
	}
	
	public Customer[] customerdetails() {
		Customer c=new Customer();
		c.setCname("sham");
		c.setContact(995588443);
		c.setEmail("@sham");
		Customer c1=new Customer();
		c1.setCname("ram");
		c1.setContact(9966733);
		c1.setEmail("@ram");
		Customer c2=new Customer();
		c2.setCname("raj");
		c2.setContact(99444223);
		c2.setEmail("@raj");
		Customer []arr3= {c,c1,c2};
		return arr3;
	}
	
	
	
	
	
	
	
}
