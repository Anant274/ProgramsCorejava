package HotelSordOrder;

import java.util.Date;

public class Order {
	
	private String orderId;
	private String orderStatus;
	private Date date;
	
	
	public Order(String orderId, String orderStatus, Date date) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.date = date;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", date=" + date + "]";
	}
	
}
