package com.manage;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.manage.config.HibernateConfig;
import com.manage.config.WebMvcConfig;

public class EmployeeAppInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {

@Override
protected Class<?>[] getRootConfigClasses() {
return new Class[] { HibernateConfig.class };
}

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class[] { WebMvcConfig.class };
}

@Override
protected String[] getServletMappings() {
return new String[] { "/" };
}
}

