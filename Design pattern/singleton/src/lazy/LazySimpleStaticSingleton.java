package lazy;

/**
 * 懒汉式单例
 */

//静态内部类的单例
//既兼顾了不耗费内存的问题，又没有采用synchronize关键字，没有性能问题
public class LazySimpleStaticSingleton {

    //默认使用LazySimpleStaticSingleton的时候会先初始化内部类，如果没使用的话，内部类是不会被加载的
    private LazySimpleStaticSingleton() {
        if(Lazy.lazySimpleSingleton !=null){
            throw new RuntimeException("不允许");
        }
    }


    //static保证内存空间共享
    //final保证方法不会被重写
    public static final LazySimpleStaticSingleton getInstance(){
        return Lazy.lazySimpleSingleton;
    }

    //默认不加载
    public static class Lazy{
       private static final LazySimpleStaticSingleton lazySimpleSingleton = new LazySimpleStaticSingleton();
    }
}
