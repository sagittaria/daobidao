/*
package spittr.config;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MyFilterInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        Dynamic filter = servletContext.addFilter("MyFilter", MyFilter.class);
        filter.addMappingForUrlPatterns(null,false,"/custom/**");
    }
}
*/