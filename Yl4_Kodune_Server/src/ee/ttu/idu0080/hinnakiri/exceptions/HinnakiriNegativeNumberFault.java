package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriFault")
public class HinnakiriNegativeNumberFault {
	private String message;

    public HinnakiriNegativeNumberFault() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
