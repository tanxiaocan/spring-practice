package test1;

import com.sun.glass.ui.Application;
import com.txc.components.User;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by tanxiaocan on 2016/8/20.
 */
public class CustomTagTest {
    @Test
    public void testCustomTag(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom-test.xml");
        User user = (User) applicationContext.getBean("testBean");
        System.out.println(user.getUserName() + " is so cool!");
        assertNotNull(user);
    }
}
