
import java.util.*;
public class Flight {
	private static int nFlights=0;
	private int FlightId;
	private Date departureDate;
	private String origin;
	private LinkedList<String> destination= new LinkedList<String>();
	private String aeroplane;
	private LinkedList<Seat> vacantseats= new LinkedList<Seat>();
	


	public Flight() {
		
	}
	

	

	
	public Flight(Date departureDate, String origin, LinkedList<String> destination, String aeroplane,
			LinkedList<Seat> vacantseats) {
		this.FlightId = ++nFlights;
		this.departureDate = departureDate;
		this.origin = origin;
		this.destination = destination;
		this.aeroplane = aeroplane;
		this.vacantseats = vacantseats;
	}





	public LinkedList<Seat> getVacantseats() {
		return vacantseats;
	}





	public void setVacantseats(LinkedList<Seat> vacantseats) {
		this.vacantseats = vacantseats;
	}





	public Flight(Date departureDate, String origin, LinkedList<String> destination,
			String aeroplane) {
		this.departureDate = departureDate;
	
		this.origin = origin;
		this.destination = destination;
		this.aeroplane = aeroplane;
	}


	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public LinkedList<String> getDestination() {
		return destination;
	}
	public void setDestination(LinkedList<String> destination) {
		this.destination = destination;
	}


	public String getAeroplane() {
		return aeroplane;
	}


	public void setAeroplane(String aeroplane) {
		this.aeroplane = aeroplane;
	}
	

	public Boolean isDirectFlight(String origin, String destination) {
		if(this.origin.equalsIgnoreCase(origin)) {
			if(this.destination.get(0).equalsIgnoreCase(destination)) {
				return true;
			}
		}
		return false;
	}
	
	public Boolean isInDirectFlight(String origin, String destination) {
		if(this.origin.equalsIgnoreCase(origin)) {
			for(int i=1; i<this.destination.size(); i++) {
				if(this.destination.get(i).equalsIgnoreCase(destination)) {
					return true;
				}
			}
		}
		return false;
	}


	public int getFlightId() {
		return FlightId;
	}


	public void setFlightId(int flightId) {
		FlightId = flightId;
	}



	
	public String flightDetail() {
		return "Flight [FlightId=" + FlightId + ", departureDate=" + departureDate + ", origin=" + origin
				+ ", destination=" + destination + ", aeroplane=" + aeroplane + "]";
	}

	@Override
	public String toString() {
		return "Flight [FlightId=" + FlightId + ", departureDate=" + departureDate + ", origin=" + origin
				+ ", destination=" + destination + ", aeroplane=" + aeroplane + "\n vacantseats=\n" + vacantseats.toString() + "]";
	}


	

	
	
	
	

}
