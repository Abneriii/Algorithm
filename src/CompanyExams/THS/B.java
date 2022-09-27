package CompanyExams.THS;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * Author:
 * Created at:2022/9/5
 * Updated at:
 **/
public class B {
    public static B ti=new B();
    public static B t2=new B();
    {
        System.out.println("构造块");
    }
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        B t=new B();
    }
}
