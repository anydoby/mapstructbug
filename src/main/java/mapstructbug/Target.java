package mapstructbug;

import lombok.Data;

@Data
public class Target {

    EventData data;
    
    @Data
    public static class EventData {

        String address;
        
        String email;
        
        String type;

    }
    
}
