package AnimalRescuer;

public class Dog {
    String breed = "pug";
    int age = 3;
    float heightM = 0.5f;
    float weight = 5;
    String name = "Dorel";

    public void eat(){
        System.out.println("He's eating Pedigree");
    }

    public void drink(){
        System.out.println("He's drinking water");
     }

    public void play (){
        System.out.println("The dog " + name + " is playing in the garden");
    }

    public void sleep(){
        System.out.println("Zzzz...");
    }
}
