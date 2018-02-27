package su.nikitos.social.services.Impl;

import su.nikitos.social.engine.Game;
import su.nikitos.social.services.GenericService;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * create time 22.02.2018
 *
 * Реализация общего сервиса
 * @author nponosov
 */
@Named
public class GenericServiceImpl implements GenericService{


    private Game rabbitGame = new Game();

    /**
     * Возвращает значение ОК
     * @return "ОК"
     * @author nponosov
     */
    @Override
    public String OkMessage() {
        return "Хорошо";
    }

    @PostConstruct
    public void init(){
        rabbitGame.run();
    }

    public String getGameSerilization(){
        return rabbitGame.getGameSerilization();
    }
}
