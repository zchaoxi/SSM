package LOL.Controller;

import LOL.Service.HeroService;
import LOL.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HeroController {

    @Autowired
    private HeroService heroService;

    @RequestMapping(value = "/queryAll")
    public String queryAllHero() throws Exception {
        System.out.println("开始查询");
        List<Hero> heroes = heroService.queryAll();
        for (Hero hero:heroes) {
            System.out.println(hero.toString());
        }
        return "hi";
    }
}
