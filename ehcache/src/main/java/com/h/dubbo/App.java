package com.h.dubbo;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Hello world!
 */
public class App {

    public static class TTT {
        String name;
        int age;

        public TTT(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name:" + name + ", age:" + age;
        }
    }

    public static void main(String[] args) {
        // 1. 创建缓存管理器
        String configFile = App.class.getClassLoader().getResource("ehcache.xml").getFile();
        System.out.println(configFile);
//        CacheManager cacheManager = CacheManager.create(configFile);
        CacheManager cacheManager = CacheManager.create();

        // 2. 获取缓存对象
        Cache cache = cacheManager.getCache("HelloWorldCache");

        // 3. 创建元素
        Element element = new Element("key1", new TTT("18", 20));

        // 4. 元素添加到缓存
        cache.put(element);

        System.out.println("size:" + cache.getSize());


        System.out.println("size:" + cache.getSize());

        cache.flush();

        //
        Element element1 = cache.get("key1");
        System.out.println(">>>" + element1.toString());
    }
}
