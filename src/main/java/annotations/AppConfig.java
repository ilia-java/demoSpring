package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Objects;

public class AppConfig {
    @Autowired
    Environment environment;
    @Bean
    DataBaseDriver oracleDriver() {
        OracleDriver oracleDriver = new OracleDriver();
        oracleDriver.setUrl(environment.getProperty("db.url"));
        oracleDriver.setUser(environment.getProperty("db.user"));
        oracleDriver.setPassword(environment.getProperty("db.password"));

        return oracleDriver;

    }

    @Bean
    DataBaseDriver mysqlDriver() {
        return new MySqlDriver();
    }
}
