import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before

    public void before(){
        director = new Director("James Dean", "QW67231A", 100000, "The Round Table", 10000000);

    }

    @Test

    public void hasBudget(){

        assertEquals(10000000, director.getBudget(), 0.01);



    }
}
