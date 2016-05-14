
public class buy extends Observer
{
	public buy(subject subject)
	{
	      this.subject = subject;
	      this.subject.attach(this);
    }

	@Override
	public void update() {
		// TODO Auto-generated method stub
		 System.out.println( subject.getQuantity()); 
	   }
	

}
