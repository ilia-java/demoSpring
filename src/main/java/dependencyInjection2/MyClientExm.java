package dependencyInjection2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("client1")
public class MyClientExm implements MyClient{
    @Autowired
    private MyService service;

    @Override
    public void dosomethinh() {
        String info = service.getInfo();
        System.out.println(info);
    }
}
