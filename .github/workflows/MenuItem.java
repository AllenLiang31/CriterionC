

public class MenuItem {

    private String name; 
    private double price;
    private String icon; 


    public MenuItem(String name, double price, String icon){
        this.name = name;
        this.icon = icon;
        this.price = price; 

    }

    public String getName(){
        return name;

    }


    public double getPrice(){
        return price;

    }

    public String getIcon(){
        return icon; 
    }


}
