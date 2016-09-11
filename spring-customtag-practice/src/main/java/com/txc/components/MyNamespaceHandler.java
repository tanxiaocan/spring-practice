package com.txc.components;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by tanxiaocan on 2016/8/20.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
