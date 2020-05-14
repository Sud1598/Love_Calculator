//package Lovecalculatorconfig;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//public class LCWebAppInitializer //implements WebApplicationInitializer 
//{
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		
//		AnnotationConfigWebApplicationContext webapplicationcontext=new AnnotationConfigWebApplicationContext();
//		webapplicationcontext.register(LCappconfig.class);
//		
//		
//		DispatcherServlet dispatcherservlet=new DispatcherServlet(webapplicationcontext);
//		
//		ServletRegistration.Dynamic mycustomdipatcherservlet= servletContext.addServlet("mydispatcherservlet", dispatcherservlet);
//		
//	
//		mycustomdipatcherservlet.setLoadOnStartup(1);
//		mycustomdipatcherservlet.addMapping("/mywebsite.com/*");
//
//		
//	}
//
//}
