package lazy;

/**
 * 懒汉式单例
 */
public class LazySimpleSingletonDoubleSyn {

    private LazySimpleSingletonDoubleSyn() {
    }

    private  static LazySimpleSingletonDoubleSyn lazySimpleSingleton = null;

    public  static LazySimpleSingletonDoubleSyn getInstance(){
        if(lazySimpleSingleton ==null){
            synchronized (LazySimpleSingletonDoubleSyn.class){
                if(lazySimpleSingleton ==null){
                    lazySimpleSingleton = new LazySimpleSingletonDoubleSyn();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
