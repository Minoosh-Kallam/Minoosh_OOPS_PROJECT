
public enum PaymentOption {

	CASH(1) , CARD(2) ;
	
	public final int multiplier ;
	
	private PaymentOption(int multiplier) {
		this.multiplier = multiplier ;
	}
}
