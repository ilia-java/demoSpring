package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mysqldatabase.properties")
public class MySqlDriver implements DataBaseDriver {
    @Value("${databaseName}")
    private String databaseName;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "MySqlDriver{" +
                "databaseName='" + databaseName + '\'' +
                ", disableStatementPooling='" + disableStatementPooling + '\'' +
                '}';
    }
}
