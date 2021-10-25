
public class Payment {
	private double totalamount;
	private Customer passenger;
	private String cardnumber;
	
	
	public Payment() {
	}

	

	public Payment(double totalamount, Customer passenger, String cardnumber) throws Exception {
		if(cardnumber.isEmpty()) {
			throw new EmptyStringException("Cardnumber cannot be Empty");
		}
		
		if(totalamount<0) {
			throw new LessThanZeroException("Amount Shouldnot be less than zero");
		}
	
		this.totalamount = totalamount;
		this.passenger = passenger;
		this.cardnumber = cardnumber;
	}



	public Customer getPassenger() {
		return passenger;
	}



	public void setPassenger(Customer passenger) {
		this.passenger = passenger;
	}



	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) throws Exception {
		if(cardnumber.isEmpty()) {
			throw new EmptyStringException("Cardnumber cannot be Empty");
		}
		this.cardnumber = cardnumber;
	}

	public double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(double totalamount)  throws Exception {
		if(totalamount<0) {
			throw new LessThanZeroException("Amount Shouldnot be less than zero");
		}
		this.totalamount = totalamount;
	}
	

}
