import io.berkel.sharedappcontext.service.BarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BarServiceTest {

    @Autowired
    private BarService barService;

    @Test
    public void testBarService() {
        assertEquals("class io.berkel.sharedappcontext.service.BarServiceImpl",this.barService.getClass().toString());
    }

}
