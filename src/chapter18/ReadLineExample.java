package chapter18;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("JeonNuRi2.html"));
        //파일을 읽고 콘솔창에 출력

        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) { //readLine은 개행이 나올 때까지 한 줄 한 줄 읽음
            buffer.append(line);
        }
        reader.close();
        System.out.println(buffer);
    }
}
