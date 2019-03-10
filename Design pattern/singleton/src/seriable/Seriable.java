package seriable;

import java.io.Serializable;

public class Seriable implements Serializable {

    private Seriable() {
    }

    private static final  Seriable seriable = new Seriable();

    public static Seriable getInstance(){

        return seriable;
    }

    private   Object readResolve(){
        return seriable;
    }
}
