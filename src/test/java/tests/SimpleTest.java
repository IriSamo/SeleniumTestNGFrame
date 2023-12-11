package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class SimpleTest extends BaseTest {

    @Test
    public void testVerifyPageTitle(){
        String titleText = openBaseURL().getTitle();

        Assert.assertEquals(titleText, "Web form");
    }

    @Test
    public void testVerifyH1Text() {
        String h1Text = openBaseURL().getH1();

        Assert.assertEquals(h1Text, "Web form");
    }
}
