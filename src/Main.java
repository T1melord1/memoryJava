public class Main {
    public static void main(String[] args) {
        Human vasya = new Human("Vasya",21);
        Human vasyaCopy = new Human("Vasya",21);



        System.out.println(vasya.equals(vasyaCopy));
    }
}
