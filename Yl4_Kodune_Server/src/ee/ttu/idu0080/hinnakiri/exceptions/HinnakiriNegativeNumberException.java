package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriFault")
public class HinnakiriNegativeNumberException extends RuntimeException {
    
	private HinnakiriFault faultInfo;

    public HinnakiriNegativeNumberException() {
        super("Number is negative.");
        
        // Set fault message
        faultInfo = new HinnakiriFault();
        faultInfo.setMessage("Number is negative.");
    }

    public HinnakiriFault getFaultInfo() {
        return faultInfo;
    }
}
