import java.util.ArrayList;
public class cart extends createitems {
	ArrayList<items> cartlist=new ArrayList<items>();
	public void addtocart(String items) 
	{
	  cartlist.add(items);
	}
	
	public void deletefromcart(String items)
	
	{
	   cartlist.remove(items);	
	}

}
