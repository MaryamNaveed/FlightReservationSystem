import java.io.FileWriter;
import java.io.IOException;

public class Reservation {
	private Customer passenger;
	private Flight flight;
	private Payment payment;
	Seat reservedSeats;
	String requiredDestination;
	Boolean status=false;
	
	public Reservation() {
	}
	
	public Reservation(Customer passenger, Flight flight, Seat reservedSeats, String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public Reservation(Customer passenger, Flight flight, Payment payment, Seat reservedSeats, String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public void makeReservation(Customer passenger, Flight flight, Payment payment, Seat reservedSeats,  String requiredDestination) {
		this.passenger = passenger;
		this.flight = flight;
		this.reservedSeats = reservedSeats;
		this.requiredDestination=requiredDestination;
	}
	
	public Seat getReservedSeats() {
		return reservedSeats;
	}

	public void setReservedSeats(Seat reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	public Customer getPassenger() {
		return passenger;
	}
	public void setPassenger(Customer passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void writeToFile() {
		try {
		      FileWriter myWriterfile = new FileWriter("reservationrecord.txt", true);
		      myWriterfile.write("\n=========================================================\n");
		      myWriterfile.write("Passenger Name: "+passenger.getName()+"\tPassenger passportnumber: "+passenger.getPassportnumber());
		      myWriterfile.write("\nFlight Id: "+ flight.getFlightId() +"\tDate: "+flight.getDepartureDate()+flight.getFlightId()+"\nOrigin: "+flight.getOrigin()+
						"\tFlight Destinations: "+flight.getDestination());
		      myWriterfile.write("\nPassenger Destination: "+this.requiredDestination+"\tAeroPlane: "+flight.getAeroplane());
		      myWriterfile.write("\nSeatId: "+reservedSeats.getSeatId()+"\tClass: "+reservedSeats.getClassofSeat());
		      myWriterfile.write("\nAmount: "+ payment.getTotalamount());
		      myWriterfile.write("\n=========================================================\n");
		      myWriterfile.close();
		      System.out.println("Successfully wrote to the file.");
		    } 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      System.out.println(e.getMessage());
		     
		
		}
		
	}
	
	public void printTicket() {
		System.out.println("=========================================================");
		System.out.println("Passenger Name: "+passenger.getName()+"\tPassenger passportnumber: "+passenger.getPassportnumber());
		System.out.println("Flight Id: "+ flight.getFlightId() +"\tDate: "+flight.getDepartureDate()+flight.getFlightId()+"\nOrigin: "+flight.getOrigin()+
				"\tFlight Destinations: "+flight.getDestination());
		System.out.println("Passenger Destination: "+this.requiredDestination+"\tAeroPlane: "+flight.getAeroplane());
		System.out.println("SeatId: "+reservedSeats.getSeatId()+"\tClass: "+reservedSeats.getClassofSeat());
		System.out.println("Amount: "+ payment.getTotalamount());
		System.out.println("=========================================================");
	}
	public void reservationFlightDetail() {
		System.out.println("Flight Id: "+ flight.getFlightId()+" Date: "+flight.getDepartureDate()+flight.getFlightId()+" Origin: "+flight.getOrigin()+
				" Destination: "+flight.getDestination()+" AeroPlane: "+flight.getAeroplane());
		
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	

}
