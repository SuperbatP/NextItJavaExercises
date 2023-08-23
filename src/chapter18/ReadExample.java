package chapter18;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    public static void main(String[] args) throws IOException {
     /*   FileInputStream inputStream = new FileInputStream("test.db");
        String result = "";
        byte[] bytes = new byte[93];
        int data = 0;

        while ((inputStream.read(bytes)) != -1){ // -1이면 더이상 읽을 데이터가 없다. 얼마나 읽었는지 '양'을 알려줌.
            // inputStream.read(); 1 byte 씩 끊어서 읽어옴.
            // 실제 읽은 데이터는 bytes에 저장(배열형태로 저장해줘야함.)
            result += new String(bytes, 0, data);
        }*/

        FileReader reader = new FileReader("test.db");
        char[] buffer = new char[200];
        String result = new String();
        int data = 0; // 읽은 바이트수를 가지고 있음.

        while ((data = reader.read(buffer)) != -1){ //읽은 데이터는 buffer에 저장됨.
            result += new String(buffer,0,data );
        }
        System.out.println(result);
    }
}
