import io.berkel.sharedappcontext.service.FooService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class FooServiceTest {

    @Autowired
    private FooService fooService;

    @Test
    public void testBarService() {
        assertEquals("class io.berkel.sharedappcontext.service.FooServiceImpl",this.fooService.getClass().toString());
    }

}
