package beanAnnotations;

import beanAnnotations.MyDAOBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
//		@Configuration
//		@ComponentScan("com.journaldev")
//		@PropertySource("classpath:oracledatabase.properties")
//		class AppConfig {
//
//			@Autowired
//			Environment environment;
//
//			@Bean
//			DataBaseDriver oracleDriver() {
//				OracleDriver oracleDriver = new OracleDriver();
//				oracleDriver.setDriver(environment.getProperty("db.driver"));
//				oracleDriver.setUrl(environment.getProperty("db.url"));
//				oracleDriver.setPort(Integer.parseInt(environment.getProperty("db.port")));
//				oracleDriver.setUser(environment.getProperty("db.user"));
//				oracleDriver.setPassword(environment.getProperty("db.password"));
//
//				return oracleDriver;
//
//			}
//
//			@Bean
//			DataBaseDriver mysqlDriver() {
//				return new MySqlDriver();
//			}
//		}
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("beanAnnotations");
		context.refresh();
		MyDAOBean myDAOBean = context.getBean(MyDAOBean.class);
		System.out.println(myDAOBean);
		MyFileSystemBean myFileSystemBean = (MyFileSystemBean) context.getBean("getMyFileSystemBean");
		MyFileSystemBean myFileSystemBean1 = (MyFileSystemBean) context.getBean("MyFileSystemBean");
		System.out.println(myFileSystemBean);
		System.out.println(myFileSystemBean1);
	}
}