package com.txc.components;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by tanxiaocan on 2016/8/20.
 */
public class UserBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {
    /*Element对应的类*/
    @Override
    protected Class getBeanClass(Element element){
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean){
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        if(StringUtils.hasText(userName)){
            bean.addPropertyValue("userName",userName);
        }
        if(StringUtils.hasText(email)){
            bean.addPropertyValue("email",email);
        }
    }
}
