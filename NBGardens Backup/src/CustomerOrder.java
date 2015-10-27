import java.util.ArrayList;

public class CustomerOrder 
{	
	private int orderID;
	private String orderStatus;
	private ArrayList<OrderLine> orderLines = new ArrayList<OrderLine>();
		
	public int getOrderID()
	{
		return orderID;
	}

	public void setOrderID(int orderID) 
	{
		this.orderID = orderID;
	}

	public ArrayList<OrderLine> getOrderLines() 
	{
		return orderLines;
	}

	public void setOrderLines(ArrayList<OrderLine> orderLines) 
	{
		this.orderLines = orderLines;
	}

	
		public String getorderStatus() 
	{
		return orderStatus;
	}

	public void setOrderStatus(String orderstatus)
	{
		this.orderStatus = orderstatus;
	}
		
		
		
		/*setters and getters
	public void setOrderStatus(String status) {
		if (status != "done" || status != "not done") {
			status = "not done";
			System.out.println("status needs to be done or not done");
		}
		else orderStatus = status;
	}
	*/


}
	