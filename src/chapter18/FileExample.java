package chapter18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws IOException {
        //URI: Uniform Resource Identifier(고유한 값) / URL: Uniform Resource Locator(동일한 값)
       /* File dir = new File("/home/pc12/mydirectory");

        if (!dir.exists()) {
            dir.mkdirs();
        }
        *//*if (dir.exists()) {
            dir.delete();
        }*//*
        System.out.println(dir.exists());

        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");
        File file3 = new File(dir, "file3.txt");


        if(!file1.exists()){
            file1.createNewFile();
        }
        if(!file2.exists()){
            file2.createNewFile();
        }
        if(!file3.exists()){
            file3.createNewFile();
        }*/

        Files.writeString(Paths.get("mydata.txt"),"안녕하세요. 이제 곧 점심시간이 다가옵니다. 오늘은 무엇을 먹을까요?");

    }

}

