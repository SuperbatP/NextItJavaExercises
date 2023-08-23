package chapter08.sec08;

import chapter08.Student;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        //정렬 알고리즘-여러종류 있는데 버블정렬은 많이 사용
        int[] numbers = {1,6,2,8,100,22,3,1,87};
        Student[] students = {
                new Student("김인교",1,17 ),
                new Student("김승원",2,32 ),
                new Student("강성훈",3,22 ),
                new Student("정예훈",4,20 ),
                new Student("조인준",5,31 ),
                new Student("박상현",6,35 ),
                new Student("김성민",7,29 ),
                new Student("김준혁",8,33 ),
                new Student("이지용",9,40 ),
                new Student("권순옥",10,28 )
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

            int temp = 0;
            for(int i = 0; i < numbers.length - 1; i++) {
                for(int j= 1 ; j < numbers.length-i; j++) {
                    if(numbers[j]<numbers[j-1]) {
                        temp = numbers[j-1];
                        numbers[j-1] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(numbers));
    }
}
