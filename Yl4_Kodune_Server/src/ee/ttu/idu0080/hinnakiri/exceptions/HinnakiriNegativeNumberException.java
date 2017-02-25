package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegativeNumberFault")
public class HinnakiriNegativeNumberException extends Exception {
    
	private HinnakiriNegativeNumberFault faultInfo;
	
	public HinnakiriNegativeNumberException() {
		this("Number is negative");
	}

    public HinnakiriNegativeNumberException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriNegativeNumberFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNegativeNumberException(String message, 
    		HinnakiriNegativeNumberFault faultInfo) {
    	super(message);
    	
    	this.faultInfo = faultInfo;
    }

    public HinnakiriNegativeNumberFault getFaultInfo() {
        return faultInfo;
    }
}