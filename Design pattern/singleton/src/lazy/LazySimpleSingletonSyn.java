package lazy;

/**
 * 懒汉式单例
 */
public class LazySimpleSingletonSyn {

    private LazySimpleSingletonSyn() {
    }

    private  static LazySimpleSingletonSyn lazySimpleSingleton = null;

    public synchronized static LazySimpleSingletonSyn getInstance(){
        if(lazySimpleSingleton ==null){
            lazySimpleSingleton = new LazySimpleSingletonSyn();
        }
        return lazySimpleSingleton;
    }
}
