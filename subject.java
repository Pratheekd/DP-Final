   import java.util.ArrayList;
	import java.util.List;
	public class subject {
		
	   private List<Observer> observers = new ArrayList<Observer>();
	   private int price;
	   private int quantity;
	   private String name;

      

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   }


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
		 notifyAllObservers();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
		 notifyAllObservers();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		 notifyAllObservers();
	} 	
	}

