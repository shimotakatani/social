package su.nikitos.social.services.Impl;

import su.nikitos.social.services.GenericService;

import javax.inject.Named;

/**
 * create time 22.02.2018
 *
 * Реализация общего сервиса
 * @author nponosov
 */
@Named
public class GenericServiceImpl implements GenericService{

    /**
     * Возвращает значение ОК
     * @return "ОК"
     * @author nponosov
     */
    @Override
    public String OkMessage() {
        return "Хорошо";
    }
}
