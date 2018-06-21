package matt.damon.core.vo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

    private String _code;
    private String _message;

    @XmlElement(name = "code")
    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        this._code = code;
    }

    @XmlElement(name = "message")
    public String getMessage() {
        return _message;
    }

    public void setMessage(String message) {
        this._message = message;
    }

}
