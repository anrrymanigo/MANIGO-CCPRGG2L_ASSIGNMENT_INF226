public class App {
    public static void main(String[] args) throws Exception {
        
        //
        GroceryItem item1 = new Diaper();
        item1.name = "EQ";
        item1.price = 250;
        item1.showItemName();

        GroceryItem item2 = new Juice();
        item2.name = "Tropicana";
        item2.price = 34;
        item2.showItemName();

        Cashier c1 = new Cashier();
        c1.checkOut(item1);
        c1.checkOut(item2);

        Cashier price = new Cashier();
        price.showItemPrice(item1);
        price.showItemPrice(item2);


        //polymorpchic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1 ;
        itemArray[1] = item2;


        double totalAmount = 0.00;
       

        for (int i =0; i < itemArray.length; i++){
            itemArray[i].showItemName();
            System.out.println(itemArray[i].price);

            totalAmount += itemArray[i].price;

        }
       System.out.println("The total amount of grocery items : "+totalAmount);

       Parrot myParrot = new Parrot();
       myParrot.eat();

    }

}
