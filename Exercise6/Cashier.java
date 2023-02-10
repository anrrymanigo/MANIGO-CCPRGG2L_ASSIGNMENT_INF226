public class Cashier {
    public void checkOut(GroceryItem item){
        System.out.println(" you have purchased "+ item.name);

    }
    public void showItemPrice(GroceryItem item){
        System.out.println( item.name + "'s price is "+ item.price + " pesos.");
    }
}
