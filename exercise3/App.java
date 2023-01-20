public class App {
    public static void main(String[] args) {
//Anrry James A. Manigo INF226
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();


        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        

        Character marksman = new Character();

        marksman.strength = 9;
        marksman.agility = 10;
        marksman.intelligence = 10;
        marksman.name = "wanwan";
        marksman.sayMyName();
        marksman.Attack();
    


        Weapon Sword = new Weapon();
        Sword.name2 = "blade of heptaseas";
        Sword.damage = 500;
        Sword.rarity = "Legendary";
        Sword.WName();
        Sword.AddDamage(400);
        Sword.WRarity();
        Sword.NameRare();
        System.out.println(Sword.NameRare());

    }
}
