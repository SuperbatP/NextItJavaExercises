package chapter18;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        //1. Buffer 미사용
        FileInputStream fileInputStream1 = new FileInputStream("skyscrapers.mp4");
        FileOutputStream fileOutputStream1 = new FileOutputStream("/home/pc12/바탕화면/sky1.mp4");

        //2. Buffer 사용
        FileInputStream fileInputStream2 = new FileInputStream("skyscrapers.mp4");
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream2);

        FileOutputStream fileOutputStream2 = new FileOutputStream("/home/pc12/바탕화면/sky2.mp4");
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream2);

        //1.  Buffer 미사용-복사
        System.out.println(" Buffer 미사용: " + copy(fileInputStream1, fileOutputStream1) + "ns");

        //1.  Buffer 사용-복사
        System.out.println(" Buffer 사용: " + copy(inputStream, outputStream) + "ns");

        outputStream.close();
        fileOutputStream2.close();
        inputStream.close();
        fileOutputStream1.close();

        fileInputStream1.close();
        fileOutputStream1.close();


    }

    private static long copy(InputStream inputStream, OutputStream outputStream) throws Exception {
        //Intpout->원본 파일 / Output -> 복사파일
        long startTime = System.nanoTime();
        int data = -1;
        while ((data = inputStream.read()) != -1) { //1byte씩 읽어드림
            outputStream.write(data);
        }
        outputStream.flush();//버퍼에 저장된 파일을 실제적으로 사용하는 것. flush/ 커밋과 유사.

        long endTime = System.nanoTime();
        return endTime - startTime; //얼마나 시간이 걸리는 지 소요 시간(long) 반환
    }
}
