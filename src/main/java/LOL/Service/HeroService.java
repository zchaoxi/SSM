package LOL.Service;


import LOL.entity.Hero;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HeroService {

    List<Hero> queryAll() throws Exception;
}
