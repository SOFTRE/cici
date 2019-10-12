package com.xxM.utils;

import com.xxM.service.AccountService;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-07 21:49:05 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class BeanFactory {
    public static Object getById(String obj) {
        try {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(BeanFactory.class.getClassLoader().getResourceAsStream("applicationContext.xml"));
            Element element = (Element) document.selectSingleNode("//bean[@id='" + obj + "']");
            element.attributeValue("id");
            String className = element.attributeValue("class");
            element.attributeValue("class");
            Object object = Class.forName(className).newInstance();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
