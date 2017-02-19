package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriFault")
public class HinnakiriNumberFormatException extends Exception {
    
	private HinnakiriFault faultInfo;

    public HinnakiriNumberFormatException() {
    	this("Number is in an incorrect format");
    }

    public HinnakiriNumberFormatException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNumberFormatException(String message, 
    		HinnakiriFault faultInfo) {
        super(message);
        
        this.faultInfo = faultInfo;
    }

    public HinnakiriFault getFaultInfo() {
        return faultInfo;
    }
}
