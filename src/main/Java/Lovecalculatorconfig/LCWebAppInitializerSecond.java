package Lovecalculatorconfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCWebAppInitializerSecond extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {LCappconfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
			String arr[]= {"/"};	
			return arr;
	}

}
