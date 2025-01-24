// order class
 class Order{
    // Attributes
    String orderId;
    String orderDate;
    // constructor
    Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

}
// shippedOrder is inheriting order
class ShippedOrder extends Order{
    //Attribute
    String trackingNumber;
    //constructor
    ShippedOrder(String orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
}
// deliverOrder is inheriting shippedOrder
class DeliverOrder extends ShippedOrder{
    // Attribute
    String deliveryDate;
    // constructor
      DeliverOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){
          super(orderId,orderDate,trackingNumber);
          this.deliveryDate=deliveryDate;
      }
      // method to get the details
      void getOrderStatus(){
          System.out.println("Order ID: "+orderId);
          System.out.println("Order Date"+orderDate);
          System.out.println("Tracking Number: "+trackingNumber);
          System.out.println("Delivery Date"+deliveryDate);
    }
}

public class OnlineRetailManagement {
    public static void main(String[] args) {

        // instance of c deliver class
       DeliverOrder deliverOrder=new DeliverOrder("ID56372","09.10.2024","T5y66","2.11.2024");
       deliverOrder.getOrderStatus();// method call
    }
}