package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriZeroFault")
public class HinnakiriZeroException extends RuntimeException {

	private HinnakiriNegativeNumberFault faultInfo;

	public HinnakiriZeroException() {
		super("Number is zero.");

		// Set fault message
		faultInfo = new HinnakiriNegativeNumberFault();
		faultInfo.setMessage("Number is zero.");
	}

	public HinnakiriNegativeNumberFault getFaultInfo() {
		return faultInfo;
	}
}
