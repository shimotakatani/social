package su.nikitos.social.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * create time 22.02.2018
 *
 * @author nponosov
 */
@JsonIgnoreProperties
public class MessageDto extends AbstractDto {

    public String message;
    public int chatId;

    public MessageDto(String message, int chatId){
        this.message = message;
        this.chatId = chatId;
    }
}
