
public class sell extends Observer{

   public sell(subject subject)
   {
		   this.subject = subject;
		   this.subject.attach(this);
   }

@Override
public void update() {
	// TODO Auto-generated method stub
	 System.out.println( subject.getQuantity() ) ; 

}

 public void process()
 {
	 
 }

}
