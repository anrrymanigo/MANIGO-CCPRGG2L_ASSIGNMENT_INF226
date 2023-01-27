public class Car {
    String brand;
    String color;
    Person owner;

    Car(String carBrand,String carColor, Person ownerName){
        this.brand = carBrand ;
        this.color = carColor;
        this.owner = ownerName;
        
    }
    void showCarOwner(){
        System.out.println( " This " + this.color +" "+ this.brand + " is owned by " + owner.name );
        
    }
}
