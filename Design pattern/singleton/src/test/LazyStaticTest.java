package test;

import lazy.LazySimpleStaticSingleton;

import java.lang.reflect.Constructor;

public class LazyStaticTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = LazySimpleStaticSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            LazySimpleStaticSingleton simpleStaticSingleton = (LazySimpleStaticSingleton)constructor.newInstance();
            LazySimpleStaticSingleton simpleStaticSingleton1 = (LazySimpleStaticSingleton)constructor.newInstance();
            System.out.println(simpleStaticSingleton == simpleStaticSingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
