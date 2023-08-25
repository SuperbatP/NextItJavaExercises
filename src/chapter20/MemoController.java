package chapter20;

import java.util.List;
import java.util.Scanner;

public class MemoController {
    private MemoService service = MemoService.getInstance();
    private MemoView view = MemoView.getInstance();

    private Scanner scanner = new Scanner(System.in);

    public void process() throws Exception {
        view.welcome();

        while (true) {
            int menu = view.mainMenu(scanner);
            switch (menu) {
                case 1 -> {
                    List<MemoVO> memos = service.selectMemos();
                    view.printMemos(memos);
                }

                case 2 -> {
                    MemoVO vo = view.insertMemo(scanner);
                    int result = service.insertMemos(vo);
                    view.insertResult(result);
                }

                case 3 -> {
                    MemoVO vo = view.updateMemo(scanner);
                    int result = service.updateMemos(vo);
                    view.updateResult(result);
                }

                case 4 -> {
                    int deleteNo = view.deleteMemo(scanner);
                    int result = service.deleteMemo(deleteNo);
                    view.deleteResult(result);
                }

                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }

                default -> view.inputError();
            }
        }
    }
}


