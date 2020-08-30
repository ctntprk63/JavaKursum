package MentorinDersler.tahirHoca.Claslar;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {
    @Test
    public  void testlastChar(){
        Main m=new Main();
        char methodumuzunSonucu= m.lastCharacter("JUnit");
        char olmasiGerekenSonuc='t';

        Assert.assertEquals('t', m.lastCharacter("JUnit"));
    }
    @Test
    public  void  testMaxNumber(){

        Main m=new Main();
        int []  arr={1,2,3,4,5};
        m.maxNumberArray(arr);

        Assert.assertEquals(5,m.maxNumberArray(arr));
    }

    @Test
    public  void testFaktoriyel(){

        Main m= new Main();
        int sonuc=m.factorial(4);
        int beklenen=24;
        Assert.assertEquals(beklenen,sonuc);


    }
    public  void deneme(){

//        String  s1="java";
//        String  s2="java";
//
//        boolean b=s1.equals(s2);
//        Assert.assertTrue(b);

        boolean b1=true && false;
        Assert.assertFalse(b1);

    }

}
