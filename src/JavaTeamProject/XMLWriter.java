package JavaTeamProject;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class XMLWriter {
    public static void main(String[] args) {
        try {
// Document 생성(문서 생성)
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();
            document.setXmlStandalone(true); // standalone="no" 제거

// Document에 products 태그 추가
            Element movies = document.createElement("movies");
            document.appendChild(movies);

            List<String> movie1 = Arrays.asList("바비", "2023.07.19", "114", "244", "8.23");
            List<String> movie2 = Arrays.asList("미션 임파서블: 데드 레코닝", "2023.07.12", "163", "399", "8.61★");
            List<String> movie3 = Arrays.asList("콘크리트 유토피아", "2023.08.09", "130", "261", "8.21★");
            List<String> movie4 = Arrays.asList("비공식작전", "2023.08.02", "132", "103", "8.17★");
            List<String> movie5 = Arrays.asList("보호자", "2023.08.15", "97", "8.8", "6.21★");
            List<String> movie6 = Arrays.asList("밀수", "2023.07.26", "129", "472", "8.03★");
            List<String> movie7 = Arrays.asList("오펜하이머", "2023.08.15", "180", "131", "8.53★");
            List<String> movie8 = Arrays.asList("엘리멘탈", "2023.06.14", "109", "686", "8.94★");
            List<String> movie9 = Arrays.asList("메가로돈2", "2023.08.15", "116", "8.2", "5.69★");

            List<List<String>> list = Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9);

            for (List<String> line : list) {
// 태그 생성
                Element movie = document.createElement("movie");
                Element title = document.createElement("title");
                title.setTextContent(line.get(0)); // 영화제목
                Element release = document.createElement("release");
                release.setTextContent(line.get(1)); // 개봉
                Element runningTime = document.createElement("runningTime");
                runningTime.setTextContent(line.get(2)); // 러닝타임
                Element attendance = document.createElement("attendance");
                attendance.setTextContent(line.get(3)); // 관객수
                Element rating = document.createElement("rating");
                rating.setTextContent(line.get(4)); // 평점
// 태그 배치
                movies.appendChild(movie); // 변경
                movie.appendChild(title);
                movie.appendChild(release);
                movie.appendChild(runningTime);
                movie.appendChild(attendance);
                movie.appendChild(rating);
            }

// XML 생성
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("encoding", "UTF-8"); // setOutputProperty : 출력형태 만들 때 사용
            transformer.setOutputProperty("indent", "yes"); // indent : 들여쓰기
            transformer.setOutputProperty("doctype-public", "yes"); // document.setXmlStandalone(true); 하면 개행이 안 되기 때문에 추가

            Source source = new DOMSource(document);
            File file = new File("/home/pc12/다운로드","movie.xml"); // 파일 경로 수정 가능
            StreamResult result = new StreamResult(file);

            transformer.transform(source, result);

            System.out.println("XML 파일이 생성되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
