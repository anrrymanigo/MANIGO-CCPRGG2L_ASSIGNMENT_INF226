public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hahaha");

        Person Me = new Person( "james", 20 );
        Person Friend = new Person( "ace ", 20);
        Pet Dog = new Pet ("kent", 5, Me);
        
        Person Classmate1 = new Person("jake", 21);
        Person Classmate2 = new Person("maria", 19);
        Person Classmate3 = new Person("kate", 20);
        
        Car Brand = new Car("Toyota", "blue", Me);

        Me.addFriend(Friend);
        Me.addclassmate(Classmate1);
        Me.addclassmate(Classmate2);
        Me.addclassmate(Classmate3);
        Dog.showOwner();
        Brand.showCarOwner();
    
    }   
}
