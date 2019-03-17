public class SingalTest {
    public static void main(String[] args) {
        Singal lcmSingal =new LcmSingal();
        lcmSingal.setName("信号");
        lcmSingal.setSigId(12);
        Singal conSingal = (Singal) lcmSingal.clone();
        conSingal.setSigValue("152");
        System.out.println(lcmSingal.getSigValue()+"-----"+conSingal.getSigValue());
    }
}
