public class Weapon {
    String name2;
    int damage;
    String rarity;
    

    public void WName(){
        System.out.println("WEAPON: "+ name2);
    }
    public void WDamage(){
        System.out.println("DAMAGE: "+ damage);
    }
    public void WRarity(){
        System.out.println("RARITY: "+ rarity);
    }

    public String NameRare(){
        return this.name2+ " " + rarity;

    
    }
    public void AddDamage(int additionalDamage){
        int Newdamage= this.damage + additionalDamage; 
        System.out.println("your weapon that has a damage of "+ damage + " has been increased by " + additionalDamage + " damage ");
        System.out.println("your weapon's total damage of:"+(Newdamage));

        this.damage = Newdamage;

   
    }


    
}
