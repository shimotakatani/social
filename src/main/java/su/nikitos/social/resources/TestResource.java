package su.nikitos.social.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import su.nikitos.social.services.GenericService;


/**
 * create time 22.02.2018
 *
 * @author nponosov
 */
@RestController
public class TestResource {

    @Autowired
    GenericService genericService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "message", defaultValue = "") String message){
        return genericService.OkMessage() + ", Ваше сообщение: \"" + message + "\"";
    }
}
