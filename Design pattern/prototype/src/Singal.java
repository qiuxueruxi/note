public abstract class Singal  implements  Cloneable{
    private String name;

    private Integer sigId ;

    private String sigValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSigId() {
        return sigId;
    }

    public void setSigId(Integer sigId) {
        this.sigId = sigId;
    }

    public String getSigValue() {
        return sigValue;
    }

    public void setSigValue(String sigValue) {
        this.sigValue = sigValue;
    }

    //复制对象
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        }catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
        return obj;
    }
}
