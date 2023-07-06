package mapstructbug;

import lombok.Data;

@Data
public class PojoB {

    String address;
    
    PojoC c;
    
}
