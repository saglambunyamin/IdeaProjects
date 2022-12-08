package day31_Constructors.Task6_Restaurant;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Bunyamin", "Malatya", 4);

        Server server1 = new Server("Ali", 1001, 8, false);
        Server server2 = new Server("Ayse", 1002, 12, true);

        Server [] servers = {server1, server2};

        Chef chef1 = new Chef("Abdullah", 1003, 14, true);
        Chef chef2 = new Chef("Mustafa", 1004, 10, false);

        Chef [] chefs = {chef1, chef2};

        restaurant1.hireServers(servers);
        restaurant1.hireChefs(chefs);

        System.out.println(chef2);
        System.out.println(restaurant1);

        restaurant1.terminateChef(1004);
        System.out.println(restaurant1);


    }
}
