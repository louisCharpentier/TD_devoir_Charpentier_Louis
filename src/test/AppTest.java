import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public String calcul(String fromMoney,String toMoney,String value) throws Exception
    {
        Assert.assertEquals(Double.toString(10 * 1.065), calcul("EUR", "USD", "10"));
        return "Ok";
    }

}
