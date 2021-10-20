package sep25_TestNG_parameters;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "d")
  public void f(String email, String password) {
  }

  @DataProvider
  public Object[][] d() {
    return new Object[][] { new Object[] { "abc@gmail.com", "abc" }, new Object[] { "xyz@gmail.com", "xyz" },new Object[] { "mnp@gmail.com", "mno" }};
    
  }
}
