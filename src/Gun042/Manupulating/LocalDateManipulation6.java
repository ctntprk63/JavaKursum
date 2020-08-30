package Gun042.Manupulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LocalDateManipulation6 {
    // testPlus adında bir test metodu yazınız. Bugünün tarihi alınız. Daha Sonra 1 gün, 1 Ay ve 1 yıl ekleyerek
    // 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.


    @Test
    public void testPlus(){

        LocalDate bugun= LocalDate.now();
        LocalDate actual=bugun.plusDays(1).plusMonths(1).plusYears(1);

        String  expect="2021-08-22";

        Assert.assertEquals("2021-08-22",actual.toString());
        // expected: beklenen, actual ise olusan demektir.





    }@Test
    public void testMinus(){
        // testminus adında bir test metodu yazınız. Bugünün tarihi alınız. Daha Sonra 1 gün, 1 Ay ve 1 yıl cikartarak
        // 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.


        LocalDate bugun1= LocalDate.now();
        LocalDate actual1=bugun1.minusDays(1).minusMonths(1).minusYears(1);

        String  expect1="2019-06-20";

        Assert.assertEquals("2019-06-20",actual1.toString());

    }

}
