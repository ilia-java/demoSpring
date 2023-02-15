package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService {
    @Autowired
    private DataBaseDriver dataBaseDriver;

    public String getDriverInfo() {
        return dataBaseDriver.getInfo();
    }
}
