package LOL.Dao;

import LOL.entity.Hero;

import java.util.List;

public interface HeroDao {
    List<Hero> queryAll() throws Exception;
}
