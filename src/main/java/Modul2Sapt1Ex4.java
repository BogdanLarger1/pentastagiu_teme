public class Modul2Sapt1Ex4 {

    public static void main(String[] args) {
        int a = 12;
        int b = 14;

        while (a < b) {
            System.out.println("Valoarea lui a este "+a);
            System.out.println(String.format("Valoarea lui a este %s",a));
            System.out.println(a++);
        }
    }
}
