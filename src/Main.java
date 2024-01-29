public class Main {
    public static void main(String[] args) {
        Human vasya = new Human("Vasya", 20);
        Human petya = new Human(vasya.getName(), vasya.getAge());

        vasya.setName("Timur");

        System.out.println(vasya.getName());
        System.out.println(petya.getName());

    }
}
