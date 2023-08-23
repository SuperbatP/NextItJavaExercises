package chapter04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m=2; m<=9; m++){ //8번 반복
            System.out.printf("*** %d단 ***\n",m);
            for (int n=1; n<=9; n++){ //9번 반
                System.out.printf("%d X %d = %d\n",m,n,m*n);
            }//n은 지역변수라 중괄호 나가면 사라짐.->다시 1부터 시작할 수 있음.
        }//중첩된 for문에서 나오면 m++로 돌아감.


        /*for (int m = 2; m <= 9; m++) {
            System.out.print("\t"+m + "단\t");
        }
        System.out.println();

        for (int n = 1; n <= 9; n++) {
            for (int m = 2; m <= 9; m++) {
                System.out.print(m + "x" + n + " = " + (m * n) + "\t");
            }
            System.out.println();
        }*/

        /*int j=1;
        while (j<=9){
            j++;
        }*/
    }
}
