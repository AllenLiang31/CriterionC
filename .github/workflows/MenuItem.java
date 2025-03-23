

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

    public String getDescription(){
        return name + "-$" + price;
    }



    public class SpicyMenuItem extends MenuItem{
        public SpicyMenuItem(String name, double price, String icon){
            super(name, price,icon );
        }


        @Override
        public String getDescription(){
            return super.getDescription() + "Spicy";
        }
    

    }

    public class GlutenFreeItem extends MenuItem{
        public GlutenFreeItem(String name, double price, String icon){
            super(name, price,icon );
        }


        @Override
        public String getDescription(){
            return super.getDescription() + "Gulten free";
        }
    

    }


}
