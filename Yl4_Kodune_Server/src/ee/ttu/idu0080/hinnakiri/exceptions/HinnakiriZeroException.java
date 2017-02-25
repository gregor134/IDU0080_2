package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriZeroFault")
public class HinnakiriZeroException extends Exception {
    
	private HinnakiriZeroFault faultInfo;
	
	public HinnakiriZeroException() {
		this("Number is zero");
	}

    public HinnakiriZeroException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriZeroFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriZeroException(String message, 
    		HinnakiriZeroFault faultInfo) {
    	super(message);
    	
    	this.faultInfo = faultInfo;
    }

    public HinnakiriZeroFault getFaultInfo() {
        return faultInfo;
    }
}