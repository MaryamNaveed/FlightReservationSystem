
public class Seat {
	private String seatId;
	private String seatDescription;
	private double reservationAmount;
	private String classofSeat;
	
	
	public Seat() {
	}
	
	

	public Seat(String seatId, String seatDescription, double reservationAmount, String classofSeat) throws Exception{
		if(reservationAmount<0) {
			throw new LessThanZeroException("Rservation amount Should not be less than 0");
			
		}
		
		this.seatId = seatId;
		this.seatDescription = seatDescription;
		this.reservationAmount = reservationAmount;
		this.classofSeat = classofSeat;
	}



	public String getSeatId() {
		return seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}
	public String getseatDescription() {
		return seatDescription;
	}
	public void setseatDescription(String seatDescription) {
		this.seatDescription = seatDescription;
	}
	public double getReservationAmount() {
		return reservationAmount;
	}
	public void setReservationAmount(double reservationAmount) throws Exception {
		if(reservationAmount<0) {
			throw new LessThanZeroException("Rservation amount Should not be less than 0");
			
		}
		this.reservationAmount = reservationAmount;
	}



	public String getSeatDescription() {
		return seatDescription;
	}



	public void setSeatDescription(String seatDescription) {
		this.seatDescription = seatDescription;
	}



	public String getClassofSeat() {
		return classofSeat;
	}



	public void setClassofSeat(String classofSeat) {
		this.classofSeat = classofSeat;
	}



	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatDescription=" + seatDescription + ", reservationAmount="
				+ reservationAmount + ", classofSeat=" + classofSeat + "]\n";
	}
	
	

}
