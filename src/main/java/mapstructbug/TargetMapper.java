package mapstructbug;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TargetMapper {

    @Mapping(source = "b.c", target = "data")
    @Mapping(target = "data.type", constant = "TargetType") // commenting this out will properly generate setters for nested objects
    Target as(PojoA a);
    
}
