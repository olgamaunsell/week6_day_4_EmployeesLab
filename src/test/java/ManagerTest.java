import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

   Manager manager;

   @Before
    public void before(){
       manager = new Manager("Kenny", "SM20192A", 40000, "Entertainment");
   }

   @Test
    public void deptName(){
       assertEquals("Entertainment", manager.getDeptName());
   }

}
