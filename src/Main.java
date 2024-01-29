public class Main {
    public static void main(String[] args) {
        int a = 15;
        Integer aa = 15;
        Integer bb = 15;

        System.out.println(aa == bb); //true

        Integer cc = 150;
        Integer dd = 150;

        System.out.println(cc.equals(dd)); //true
    }
}
