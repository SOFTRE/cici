package com.xxM.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class BeanFactory02 {
    private static Map<String, Object> beans;

    static {
        try {
            beans = new HashMap<String, Object>();
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(BeanFactory02.class.getClassLoader().getResourceAsStream("applicationContext.xml"));
            List<Element> nodes = document.selectNodes("//bean");
            for (Element node : nodes) {
                String id = node.attributeValue("id");
                String aClass = node.attributeValue("class");
                beans.put(id,Class.forName(aClass).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object getById(String obj) {
        return beans.get(obj);
    }
}
