package xyz.ylx.design_pattern.util;

import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    // 该方法从XML配置文件中提取具体类类名，并返回一个对象实例
    public static Object getBean(String args) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();

            Document doc;
            doc = builder.parse(new File("C:\\Code\\design_pattern\\src\\main\\java\\xyz\\ylx\\design_pattern\\structural\\proxy\\config.xml"));
            NodeList n1 = null;
            Node classNode = null;
            String cName = null;
            n1 = doc.getElementsByTagName("className");

            if (args.equals("image") || StringUtils.isEmpty(args)) {
                classNode = n1.item(0).getFirstChild();
            } else if (args.equals("os")) {
                classNode = n1.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            // 通过类名生成实例并返回
            Class<?> c = Class.forName(cName);
            Object obj = c.getConstructor().newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
