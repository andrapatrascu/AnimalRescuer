package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Dog somedog = new Dog();
        Dog anotherDog = new Dog();

        System.out.println(somedog.breed);
        System.out.println(somedog.age);
        System.out.println(somedog.heightM);
        System.out.println(somedog.weight);
        somedog.drink();
        somedog.eat();


        somedog.play();
        anotherDog.name = "Azorel";
        anotherDog.age = 73;
        anotherDog.play();

        Animal fish = new Animal();
        Adopter human = new Adopter();
        Food papa = new Food();
        Activity tenis = new Activity();
        Vet medical = new Vet();




        System.out.println("Name:" + fish.name);
        System.out.println("Age:" + fish.age);
        System.out.println("HealthLevel:" + fish.healthLevel);
        System.out.println("JoyLevel:" + fish.joyLevel );
        System.out.println("FavouriteFood:" + fish.favouriteFood);
        System.out.println("FavouriteActivity:" + fish.favoutiteActivity);


        System.out.println("AdopterName:" + human.name);
        System.out.println("AvailableMoney:" + human.availableMoney);


        System.out.println("FoodName:" + papa.name);
        System.out.println("Price:" + papa.price);
        System.out.println("Quantity:" + papa.quantity);
        System.out.println("StockAvailability:" + papa.availability);

        System.out.println("FavouriteSport:" + tenis.name);

        System.out.println("Name:" + medical.name);
        System.out.println("What kind:" + medical.specialization);
    }

}
