package dependencyInjection;

import ComponentAnnotation.MathComponent;
import ServiceAnnotation.MathService;
import annotations.AppConfig;
import annotations.DataBaseDriver;
import annotations.UserService;
import beanAnnotations.MyDAOBean;
import beanAnnotations.MyFileSystemBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class DemoSpringApplication{

	public static void main(String[] args) {
//		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//			DataBaseDriver oracle = appContext.getBean("oracleDriver", DataBaseDriver.class);
//		DataBaseDriver mysql = appContext.getBean("mysqlDriver", DataBaseDriver.class);
//			System.out.println("Oracle driver info:");
//			System.out.println(oracle.getInfo());
//
//			System.out.println("MySQL driver info:");
//			System.out.println(mysql.getInfo());
//
//			appContext.close();
//
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.scan("beanAnnotations");
//		context.refresh();
//		MyDAOBean myDAOBean = context.getBean(MyDAOBean.class);
//		System.out.println(myDAOBean);
//		MyFileSystemBean myFileSystemBean = (MyFileSystemBean) context.getBean("getMyFileSystemBean");
//		MyFileSystemBean myFileSystemBean1 = (MyFileSystemBean) context.getBean("MyFileSystemBean");
//		System.out.println(myFileSystemBean);
//		System.out.println(myFileSystemBean1);
//
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
//		context2.scan("ServiceAnnotation");
//		context2.refresh();
//		MathService ms = context2.getBean(MathService.class);
//		int add = ms.add(1, 2);
//		System.out.println("Addition of 1 and 2 = " + add);
//
//		int subtract = ms.subtract(2, 1);
//		System.out.println("Subtraction of 2 and 1 = " + subtract);
//		context2.close();
//
//		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext();
//		context3.scan("ComponentAnnotation");
//		context3.refresh();
//		MathComponent mathComponent = context3.getBean(MathComponent.class);
//		int result = ms.add(1, 2);
//		System.out.println("Addition of 1 and 2 = " + result);
//
//		context3.close();
		AnnotationConfigApplicationContext cntx= new AnnotationConfigApplicationContext();
		cntx.scan("dependencyInjection");
		cntx.refresh();
		MyApplication app=cntx.getBean(MyApplication.class);
		app.processMessage("hi ali","tddg@gmail.com");
		cntx.close();
	}
}