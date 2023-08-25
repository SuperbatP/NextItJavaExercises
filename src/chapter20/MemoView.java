package chapter20;

import java.util.List;
import java.util.Scanner;

public class MemoView {
    private static MemoView instance = new MemoView();

    public MemoView() {
    }

    public static MemoView getInstance() {
        return instance;
    }

    public void welcome() {
        System.out.println("나의 메모");
    }

    public int mainMenu(Scanner scanner) {
        System.out.println("--------------------------------------");
        System.out.println("1.목록 | 2.등록 | 3.수정 | 4.삭제 | 0.종료");
        System.out.println("--------------------------------------");
        System.out.print("메뉴 선택>");
        return Integer.parseInt(scanner.nextLine());
    }

    public void printMemos(List<MemoVO> memos) {
        System.out.println("전체 목록");
        memos.forEach(System.out::println);
    }

    public MemoVO insertMemo(Scanner scanner) {
        System.out.println("메모를 새로 작성합니다.");
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("작성자 아이디: ");
        String writer = scanner.nextLine();
        return new MemoVO(title, content, writer);
    }

    public void insertResult(int result) {
        if (result > 0) {
            System.out.println("메모가 등록되었습니다.");
        } else {
            System.out.println("정상적으로 메모가 등록되지 않았습니다.");
        }
    }

    public MemoVO updateMemo(Scanner scanner)   {
        System.out.println("수정할 메모 번호를 입력하세요.");
        int no = Integer.parseInt(scanner.nextLine());
        System.out.print("제목: ");
        String title = scanner.nextLine();
        System.out.print("내용: ");
        String content = scanner.nextLine();
        System.out.print("작성자 아이디: ");
        String writer = scanner.nextLine();
        return new MemoVO(no, title, content, writer);
    }

    public void updateResult(int result) {
        if (result > 0) {
            System.out.println("메모가 수정되었습니다.");
        } else {
            System.out.println("정상적으로 메모가 수정되지 않았습니다.");
        }
    }

    public int deleteMemo(Scanner scanner){
        System.out.println("삭제할 메모 번호를 입력하세요.");
        return Integer.parseInt(scanner.nextLine());
    }

    public void deleteResult(int result){
        if (result > 0) {
            System.out.println("메모가 삭제되었습니다.");
        } else {
            System.out.println("정상적으로 메모가 삭제되지 않았습니다.");
        }
    }

    public void inputError(){
        System.out.println("메뉴 입력이 잘못 입력되었습니다.");
    }

}
