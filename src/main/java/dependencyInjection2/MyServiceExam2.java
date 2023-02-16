package dependencyInjection2;

import org.springframework.stereotype.Component;

@Component("service2")
public class MyServiceExam2 implements MyService {
    @Override
    public String getInfo() {
        return "Service 2's Info";
    }
}
