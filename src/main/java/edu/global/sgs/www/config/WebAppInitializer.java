package edu.global.sgs.www.config;

import edu.global.sgs.www.config.web.WebMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringApplicationContextInitializer.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}