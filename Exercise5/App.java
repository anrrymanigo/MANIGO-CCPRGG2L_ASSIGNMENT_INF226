public class App {
    public static void main(String[] args) throws Exception {
        Person me = new Person();

        me.setName("james");

        System.out.println(me.getName());

        Son myself = new Son();

        System.out.println(myself.surname);

        myself.showSurname();


    }
}
