import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    void addItem(OrderItem item) {
        items.add(item);
    }

    void removeItem(OrderItem item) {
        items.remove(item);
    }

    Double total() {
        Double total = 0.0;
        for (OrderItem i : items) {
            total += i.getPrice() * i.getQuantity();
        }
        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        String text = "Order moment: " + sdf.format(moment)
            + "\nOrder status: " + status
            + "\nClient: " + client
            + "\nOrder items:";

        for(OrderItem i: items){
            text += "\n" + i;
        }
        text += "\nTotal price: $" + String.format("%.2f", total());

        return text;
    }

}
