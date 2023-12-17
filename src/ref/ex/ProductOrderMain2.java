package ref.ex;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		
		ProductOrder[] orders = new ProductOrder[3];
		
		//ProductOrder order1 = createOrder("두부", 2000, 2);
		ProductOrder order1 = createOrder("두부", 2000, 2);
		orders[0] = order1;
		//ProductOrder order2 = createOrder("김치", 5000, 1);
		ProductOrder order2 = createOrder("김치", 5000, 1);
		orders[1] = order2;
		//ProductOrder order3 = createOrder("콜라", 1500, 2);
		ProductOrder order3 = createOrder("콜라", 1500, 2);
		orders[2] = order3;
		
		printOrders(orders);
		int totalAmount = getTotalAmount(orders);
		System.out.println("총 결재 금액: " + totalAmount);

	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}
	
	static void printOrders(ProductOrder[] orders) {
//		for(ProductOrder order : orders) {
//			System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
//		}
		for(int i = 0; i < orders.length; i++) {
			System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
		}
		
	}
	
	static int getTotalAmount(ProductOrder[] orders) {
//		int totalAmount = 0;
//		for(ProductOrder order : orders) {
//			totalAmount += order.price * order.quantity;
//		}
//		return totalAmount;
		int totalAmount = 0;
		for(int i = 0; i < orders.length; i++) {
			totalAmount += orders[i].price * orders[i].quantity;
		}
		return totalAmount;
		
	}

}
