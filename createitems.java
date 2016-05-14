import java.util.ArrayList;
public class createitems {
	
   public static void main(String[] args)
   {
	   ArrayList<subject> arrlist = new ArrayList<subject>();    
	
	   subject i1=new subject();
	   subject i2=new subject();
	  
	   i1.setQuantity(10);
	   i1.setName("itm");
	   i1.setPrice(200);
	   
	   i2.setQuantity(05);
	   i2.setPrice(500);
	   i2.setName("itm2");
	   
	   subject i3=new subject();
		  
	   i3.setQuantity(6);
	   i3.setName("itm3");
	   i3.setPrice(400);
	   
	   arrlist.add(i1);
	   arrlist.add(i2);
	   arrlist.add(i3);
	  
	
	//System.out.println(i2.getName());
	
  }
}
