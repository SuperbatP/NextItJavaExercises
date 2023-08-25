package chapter20;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MemoViewTest {

    @Test
    void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        MemoView view = MemoView.getInstance();
        int i = view.mainMenu(scanner);
        assertEquals(1, i);
    }
}