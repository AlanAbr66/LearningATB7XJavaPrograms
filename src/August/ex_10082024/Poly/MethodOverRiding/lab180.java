package August.ex_10082024.Poly.MethodOverRiding;

public class lab180 {
    // MethodOverRiding| Runtime Poly
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_Ref = new Dog();
        dog_Ref.bark();

        //Hound h2 = new Dog();

    }
}