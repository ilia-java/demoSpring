package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApplication {
       private MessageService messageService;

       @Autowired
    public boolean processMessage(String msg, String rec){
        return this.messageService.sendMessage(msg, rec);
    }
}
