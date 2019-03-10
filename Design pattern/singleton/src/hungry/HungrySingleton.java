package hungry;


/**
 * 饿汉式单例
 */
public class HungrySingleton {

    //在类加载的时候就初始化，创建单例对象，线程绝对安全，在线程还没开始创建的时候就已经初始化了

    private static final  HungrySingleton hungry = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungry;
    }

}
