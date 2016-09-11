import com.txc.spring.beans.practices.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by tanxiaocan on 2016/8/16.
 */
public class BeanFactoryTest {
    @SuppressWarnings("deprecation")
    @Test
    public void  testSimpleLoad(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
        System.out.println(bean.getTestProfile());
        assert(bean.getTestStr().equals("testStr"));
    }
}
