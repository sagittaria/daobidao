package spittr.web;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();
        assertEquals("index", controller.index());
    }
}