package LOL.Service.Impl;


import LOL.Dao.HeroDao;
import LOL.Service.HeroService;
import LOL.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    @Autowired
    private HeroDao heroDao;

    public List<Hero> queryAll() throws Exception {
        return heroDao.queryAll();
    }
}
