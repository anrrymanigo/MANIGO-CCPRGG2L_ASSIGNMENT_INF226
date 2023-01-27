class Pet{
    int age;
    String name;
    Person owner;

    Pet(String petName, int petAge, Person ownerName){
        this.name = petName ;
        this.age = petAge;
        this.owner = ownerName;
    }
    void showOwner(){
        System.out.println( " I'm a dog and my name is " + this.name + " my owner's name is " + owner.name );
        
    }
}