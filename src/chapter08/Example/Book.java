package chapter08.Example;

public abstract class Book {
    private int number;
    private String title;
    private String author;

    private static int countOfBooks = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        number = countOfBooks++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLateFee(int lateDays);

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj){//this : 현재 객체의 주소값, obj : 들어온 객체의 주소값.
            return true;
        }
        /* if(!(obj instanceof Book)){ //Object를 사용할때는 무조건 캐스팅이 가능한지 instanceof 써야함.
         return false;
        }
        if (this.author.equals(((Book) obj).getAuthor()) && this.title.equals(((Book) obj).getTitle())) {
            return true;
        } -> 즉, equlas 메소드 오버라이딩은 이런 구조를 사용한다는 것.

        */
        return false;
    }

    @Override
    public String toString() {
        return "관리번호 " + number + "번, 제목: " + title + ", 저자:" + author + "(일주일 연체료 : " + String.format("%,d" , getLateFee(7))+ ")";
    }
}
