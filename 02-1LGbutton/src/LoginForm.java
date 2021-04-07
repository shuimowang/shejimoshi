import Button.AbstractButton;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * DOM方式解析xml
 */
public class LoginForm {
    public static void main(String args[]){

        //创建一个DocumentBuilderFactory的对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        AbstractButton source = null;

        try {
            //创建一个DocumentBuilder对象
            DocumentBuilder db = dbf.newDocumentBuilder();
            //通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
            /*注意导入Document对象时，要导入org.w3c.dom.Document包下的*/
            Document doc = db.parse("config.xml");//传入文件名可以是相对路径也可以是绝对路径

            Node n1 = doc.getElementsByTagName("className").item(0);
            String className=n1.getTextContent();
            //获取指定类的class文件对象
            Class c1 = Class.forName("Button."+className);
            source = (AbstractButton) c1.newInstance();
            source.view();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
