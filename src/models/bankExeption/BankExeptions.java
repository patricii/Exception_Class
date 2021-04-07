package models.bankExeption;

public class BankExeptions extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BankExeptions(String msg) {
		super(msg);
		
	}
}
