package su.nikitos.social.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import su.nikitos.social.dto.MessageDto;
import su.nikitos.social.services.GenericService;

import javax.inject.Inject;
import javax.ws.rs.core.Response;


/**
 * create time 22.02.2018
 *
 * @author nponosov
 */
@RestController
public class TestResource {

    @Inject
    GenericService genericService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public MessageDto test(@RequestParam(value = "message", defaultValue = "") String message){
        return new MessageDto(genericService.OkMessage() + ", Ваше сообщение: \"" + message + "\"", 1);
    }

    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public MessageDto game() {
        return new MessageDto(genericService.getGameSerilization(), 1);
    }
}
