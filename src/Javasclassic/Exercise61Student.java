package Javasclassic;

public class Exercise61Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Exercise61Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    @Override
    public String toString() {
        return name + ',' +
                ban + ',' +
                no + ',' +
                kor + ',' +
                eng + ',' +
                math;
    }
}
