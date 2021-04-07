import Source.AbstractSource;
import Transformer.AbstractTransformer;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class MainClass{
    public static void main(String args[]) {

        //创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        AbstractSource source = null;
        AbstractTransformer transformer = null;

        try {
            //创建一个DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();
            //通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
            /*注意导入Document对象时，要导入org.w3c.dom.Document包下的*/
            Document doc = db.parse("config.xml");//传入文件名可以是相对路径也可以是绝对路径

            Node n1 = doc.getElementsByTagName("sourceName").item(0);
            Node n2 = doc.getElementsByTagName("transformerName").item(0);
            String sourceName = n1.getTextContent();
            String transformerName = n2.getTextContent();

            //获取指定类的class文件对象
            Class c1 = Class.forName("Source."+sourceName);
            Class c2 = Class.forName("Transformer."+transformerName);
            source = (AbstractSource) c1.newInstance();
            transformer = (AbstractTransformer) c2.newInstance();

            source.change();
            transformer.change();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}