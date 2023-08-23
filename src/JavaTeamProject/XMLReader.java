package JavaTeamProject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File("/home/pc12/다운로드", "movie.xml");
            Document document = builder.parse(file); // movie.xml 파싱(분석)

            // 최상위 요소(root)
            Element root = document.getDocumentElement();
            System.out.println("최상위 요소 : " + root.getNodeName());

            List<Movie> movies = new ArrayList<>();

            // 최상위 요소의 자식 노드들
            NodeList nodeList = root.getChildNodes(); // 자식노드들 가져오기
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList nodeList2 = node.getChildNodes();
                    Movie movie = new Movie();
                    for (int j = 0; j < nodeList2.getLength(); j++) {
                        Node node2 = nodeList2.item(j);
                        if (node2.getNodeType() == Node.ELEMENT_NODE) {
                            switch (node2.getNodeName()) {
                                case "title":
                                    movie.setTitle(node2.getTextContent());
                                    break;
                                case "release":
                                    movie.setRelease(node2.getTextContent());
                                    break;
                                case "runningTime":
                                    movie.setRunningTime(Integer.parseInt(node2.getTextContent()));
                                    break;
                                case "attendance":
                                    movie.setAttendance(Integer.parseInt(node2.getTextContent()));
                                    break;
                                case "rating":
                                    movie.setRating(Double.parseDouble(node2.getTextContent()));
                                    break;
                            }
                        }
                    }
                    movies.add(movie);
                }
            }

            // ArrayList 확인
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}