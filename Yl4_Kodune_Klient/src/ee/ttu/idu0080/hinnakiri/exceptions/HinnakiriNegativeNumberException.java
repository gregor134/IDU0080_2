package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegativeNumberFault")
public class HinnakiriNegativeNumberException extends RuntimeException {
    
	private HinnakiriNegativeNumberFault faultInfo;

    public HinnakiriNegativeNumberException() {
        super("Number is negative.");
        
        // Set fault message
        faultInfo = new HinnakiriNegativeNumberFault();
        faultInfo.setMessage("Number is negative.");
    }

    public HinnakiriNegativeNumberFault getFaultInfo() {
        return faultInfo;
    }
}
