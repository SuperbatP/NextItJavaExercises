package Javasclassic;

public class Exercise45 {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        int i = 0;
        while( i <=5) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
