import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<MenuItem> menuItems = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();
    private List<String> icon = new ArrayList<>(); 

    public void addMenuItem(MenuItem item ){
        menuItems.add(item);
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void addTestimonial(Icon icon){
        icon.add(icon);
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<String> getTestimonials() {
        return icon;
    }
}
