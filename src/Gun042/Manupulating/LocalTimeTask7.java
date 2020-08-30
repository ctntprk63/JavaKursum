package Gun042.Manupulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class LocalTimeTask7 {
    //using current LocalTime
    //1. test current time with plus minute and plus hour :
    //      Şu andaki zamana 1 saat ve 1 dakika ekleyerek sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    //2. test current time with minus minute and plus hour:
    //      Şu andaki zamana 1 saat ve 1 dakika çıkartarak sonucun saatini ve dakikasını ayrı ayrı test ediniz.
@Test
    public void testPlus()

    {
        LocalDateTime time=LocalDateTime.now();
        LocalDateTime actual=time.plusHours(1).plusMinutes(1);

        Assert.assertEquals(22,actual.getHour());
        Assert.assertEquals(49,actual.getMinute());






    }
    @Test
    public  void testMinus(){


        LocalDateTime time=LocalDateTime.now();
        LocalDateTime actual=time.minusHours(1).minusMinutes(1);

        Assert.assertEquals(20,actual.getHour());
        Assert.assertEquals(49,actual.getMinute());


    }




}
