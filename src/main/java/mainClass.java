

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		try {
			admin = new Admin("Maryam Naveed", "Female", 25, "1-10/1 Islamabad",
					new LoginInfo("maryam@gmail.com", "1234"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Flight[] flights = new Flight[100];
		LinkedList<Seat> seat = new LinkedList<Seat>();
		LinkedList<String> destinationlist;
		try {
			seat.add(new Seat("A1", "Window Seat", 12000, "Buisnessclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("B1", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("C1", "Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("D1", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("E1", "Not a Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("F1", "Window Seat", 10000, "Economysclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("G1", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("H1", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("I1", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("J1", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		destinationlist = new LinkedList<String>();
		destinationlist.add("New York");
		destinationlist.add("Amsterdam");
		destinationlist.add("Singapore");
		destinationlist.add("Hong Kong");
		flights[0] = new Flight(new Date(), "Islamabad", destinationlist, "PIA", seat);

		seat = new LinkedList<Seat>();
		try {
			seat.add(new Seat("A2", "Window Seat", 12000, "Buisnessclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("B2", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("C2", "Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("D2", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("E2", "Not a Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("F2", "Window Seat", 10000, "Economysclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("G2", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("H2", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("I2", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("J2", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		destinationlist = new LinkedList<String>();
		destinationlist.add("Paris");
		flights[1] = new Flight(new Date(), "Islamabad", destinationlist, "Shaheen", seat);

		seat = new LinkedList<Seat>();
		try {
			seat.add(new Seat("A3", "Window Seat", 12000, "Buisnessclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("B3", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("C3", "Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("D3", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("E3", "Not a Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("F3", "Window Seat", 10000, "Economysclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("G3", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("H3", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("I3", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("J3", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		destinationlist = new LinkedList<String>();
		destinationlist.add("SingaPore");
		destinationlist.add("Hong Kong");
		flights[2] = new Flight(new Date(), "Islamabad", destinationlist, "Air Blue", seat);

		seat = new LinkedList<Seat>();
		try {
			seat.add(new Seat("A4", "Window Seat", 12000, "Buisnessclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("B4", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("C4", "Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("D4", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("E4", "Not a Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("F4", "Window Seat", 10000, "Economysclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("G4", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("H4", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("I4", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("J4", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		destinationlist = new LinkedList<String>();
		destinationlist.add("Amsterdam");
		destinationlist.add("Singapore");
		destinationlist.add("Hong Kong");
		flights[3] = new Flight(new Date(), "Islamabad", destinationlist, "Emirates", seat);

		seat = new LinkedList<Seat>();
		try {
			seat.add(new Seat("A5", "Window Seat", 12000, "Buisnessclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("B5", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("C5", "Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("D5", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("E5", "Not a Window Seat", 15000, "Firstclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("F5", "Window Seat", 10000, "Economysclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("G5", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			seat.add(new Seat("H5", "Not a Window Seat", 12000, "Buisnessclass"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("I5", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {

			seat.add(new Seat("J5", "Not a Window Seat", 10000, "Economyclass"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		destinationlist = new LinkedList<String>();
		destinationlist.add("SingaPore");
		destinationlist.add("Hong Kong");
		destinationlist.add("Paris");
		flights[4] = new Flight(new Date(), "Islamabad", destinationlist, "Qatar Airlines", seat);

		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		ArrayList<Payment> payments = new ArrayList<Payment>();
		Customer loginCustomer = new Customer();
		Boolean loginStatusAdmin = false;
		Boolean loginStatusCustomer = false;
		while (true) {
			if (!loginStatusCustomer && !loginStatusAdmin) {
				String option = null;
				System.out.println("-------------------------");
				System.out.println(
						"What do you want to do?... You need to login in order to see or book flight schedule");
				System.out.println("1. Sign in As Admin");
				System.out.println("2. Create New Account of Customer");
				System.out.println("3. Sign in as customer");
				System.out.println("4. Exit");
				System.out.println("--------------------------");
				Scanner input = new Scanner(System.in);
				option = input.nextLine();

				if (option.equalsIgnoreCase("1")) {
					System.out.print("Enter email: ");
					input = new Scanner(System.in);
					String email = input.nextLine();
					System.out.print("Enter password: ");
					input = new Scanner(System.in);
					String password = input.nextLine();
					try {
						if (admin.getCredentials().searchLogin(email, password)) {
							System.out.println("Login Successfully");
							loginStatusAdmin = true;
						} else {
							System.out.println("Incorrect Email or Password");

						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

				} else if (option.equalsIgnoreCase("2")) {
					System.out.print("Enter name: ");
					input = new Scanner(System.in);
					String name = input.nextLine();
					System.out.print("Enter gender: ");
					input = new Scanner(System.in);
					String gender = input.nextLine();
					int age;
					while (true) {
						try {
							System.out.print("Enter age: ");
							input = new Scanner(System.in);
							age = input.nextInt();
							break;
						} catch (Exception e) {
							System.out.println(e);

						}

					}
					System.out.print("Enter address: ");
					input = new Scanner(System.in);
					String address = input.nextLine();
					System.out.print("Enter email: ");
					input = new Scanner(System.in);
					String email = input.nextLine();
					System.out.print("Enter password: ");
					input = new Scanner(System.in);
					String password = input.nextLine();
					Boolean emailStatus = false;
					for (int i = 0; i < customers.size(); i++) {
						try {
							if (customers.get(i).getCredentials().searchEmail(email)
									&& !(customers.get(i).getCredentials().getPassword().isEmpty())) {
								emailStatus = true;
								break;
							}
						} catch (Exception e) {

						}

					}
					if (emailStatus) {
						System.out.println("This email already have an account");
					} else {
						try {
							Customer cust = new Customer(name, gender, age, address, new LoginInfo(email, password));
							customers.add(cust);
							loginCustomer = cust;
							loginStatusCustomer = true;
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}

					}
				} else if (option.equalsIgnoreCase("3")) {
					System.out.print("Enter email: ");
					input = new Scanner(System.in);
					String email = input.nextLine();
					System.out.print("Enter password: ");
					input = new Scanner(System.in);
					String password = input.nextLine();
					for (int i = 0; i < customers.size(); i++) {
						try {
							if (customers.get(i).getCredentials().searchLogin(email, password)) {
								System.out.println("Login Successfully");
								loginCustomer = customers.get(i);
								loginStatusCustomer = true;
								break;
							}
						} catch (Exception e) {

						}
					}
					if (!loginStatusCustomer) {
						System.out.println("Incorrect Email or Password");

					}
				} else if (option.equalsIgnoreCase("4")) {
					break;
				} else {
					System.out.println("Invalid Option Selected");
				}

			} else {
				String option = null;
				System.out.println("-------------------------");
				System.out.println("What do you want to do?");
				System.out.println("1. See All Registered Customers");
				System.out.println("2. Book A Flight");
				System.out.println("3. See Flight Schedule Calendar");
				System.out.println("4. See Direct or Indirect Flights Details");
				System.out.println("5. Lowest Fair on a particular date");
				System.out.println("6. See available Seats");
				System.out.println("7. See ticket details of a passenger flight");
				System.out.println("8. Cancel reservation");
				System.out.println("9. Log Out");
				System.out.println("10. Exit");
				System.out.println("--------------------------");
				Scanner input = new Scanner(System.in);
				option = input.nextLine();

				if (option.equalsIgnoreCase("1")) {
					if (!loginStatusAdmin) {
						System.out.println("You are not signed in as Admin... Only Admin can see customer list");
					} else {
						System.out.println("***********************");
						for (int i = 0; i < customers.size(); i++) {

							try {
								if (!customers.get(i).getCredentials().getPassword().isEmpty()) {
									
									System.out.println(customers.get(i).toString());
								}

							} catch (Exception e) {

							}
						}
						System.out.println("***********************");
					}
				} else if (option.equalsIgnoreCase("2")) {

					System.out.print("Enter name: ");
					input = new Scanner(System.in);
					String name = input.nextLine();
					System.out.print("Enter gender: ");
					input = new Scanner(System.in);
					String gender = input.nextLine();
					int age;
					while (true) {
						try {
							System.out.print("Enter age: ");
							input = new Scanner(System.in);
							age = input.nextInt();
							break;
						} catch (Exception e) {
							System.out.println(e);

						}

					}
					System.out.print("Enter address: ");
					input = new Scanner(System.in);
					String address = input.nextLine();
					String email;
					if (loginStatusCustomer) {
						email = loginCustomer.getCredentials().getEmail();
					} else {
						System.out.print("Enter email: ");
						input = new Scanner(System.in);
						email = input.nextLine();
					}

					try {
						Customer cust = new Customer(name, gender, age, address);
						cust.getCredentials().setEmail(email);
						customers.add(cust);
						loginCustomer = cust;
						loginStatusCustomer = true;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					if (loginStatusCustomer) {
						if (loginStatusAdmin) {
							loginStatusCustomer = false;
						}
						Boolean isFlight = false;
						System.out.println("Enter Passportnumber");
						input = new Scanner(System.in);
						String passportnumber = input.nextLine();
						try {
							loginCustomer.setPassportnumber(passportnumber);
							System.out.print("Enter origin: ");
							input = new Scanner(System.in);
							String origin = input.nextLine();
							System.out.print("Enter destination: ");
							input = new Scanner(System.in);
							String destination = input.nextLine();
							System.out.println("--------------------------");
							System.out.println(
									"Below are the direct and indirect flights enter the flightId out of these");
							System.out.println("=====Direct Flights=====");
							for (int i = 0; i < flights.length; i++) {
								try {
									if (flights[i].isDirectFlight(origin, destination)) {
										System.out.println(flights[i].flightDetail());
										isFlight = true;
									}
								} catch (Exception e) {

								}
							}
							System.out.println("=====Indirect Flights=====");
							for (int i = 0; i < flights.length; i++) {
								try {
									if (flights[i].isInDirectFlight(origin, destination)) {
										System.out.println(flights[i].flightDetail());
										isFlight = true;
									}
								} catch (Exception e) {

								}
							}
							System.out.println("--------------------------");
							if (isFlight == false) {
								System.out.println("No flight exist of these requirements");
								continue;
							}
							int FlightId;
							while (true) {
								try {
									input = new Scanner(System.in);
									FlightId = input.nextInt();
									break;
								} catch (Exception e) {
									System.out.println(e);

								}

							}

							Flight bookflight = null;

							for (int i = 0; i < flights.length; i++) {
								try {
									if (flights[i].getFlightId() == FlightId) {
										bookflight = flights[i];
									}
								} catch (Exception e) {

								}
							}
							if (bookflight != null) {
								if (bookflight.getVacantseats().size() <= 0) {
									System.out.println("No seat available for this flight");
								}
								System.out
										.println("Below are the available seats for this flightId...Choose your seat");
								System.out.println(bookflight.getVacantseats());
								input = new Scanner(System.in);
								String seatId = input.nextLine();
								Seat reserveseat = null;

								for (int i = 0; i < bookflight.getVacantseats().size(); i++) {
									try {
										if (bookflight.getVacantseats().get(i).getSeatId().equalsIgnoreCase(seatId)) {
											reserveseat = bookflight.getVacantseats().get(i);

										}
									} catch (Exception e) {

									}
								}
								if (reserveseat != null) {
									Reservation newreservation = new Reservation(loginCustomer, bookflight, reserveseat,
											destination);
									double charges = newreservation.getReservedSeats().getReservationAmount();
									System.out.println("Amount For your Reserved seat is: " + charges);
									System.out.print("Enter your cardnumber For payment: ");
									input = new Scanner(System.in);
									String cardnumber = input.nextLine();
									try {
										Payment newpayment = new Payment(charges, loginCustomer, cardnumber);
										System.out.println("Press 1 to confirm payment and any other key to reject it");
										input = new Scanner(System.in);
										String statusPayment = input.nextLine();
										if (statusPayment.equalsIgnoreCase("1")) {
											bookflight.getVacantseats().remove(newreservation.getReservedSeats());
											newreservation.setPayment(newpayment);
											newreservation.setStatus(true);
											reservations.add(newreservation);
											payments.add(new Payment(charges, loginCustomer, cardnumber));
											System.out.println("Reservation Done Successfully!!!");
											newreservation.writeToFile();

										} else {
											System.out.println("Reservation cannot be made without payment");
										}

									} catch (Exception e) {
										System.out.println(e.getMessage());
									}

								} else {
									System.out.println("No seat of this ID exist");
								}
							} else {
								System.out.println("No Flight of this ID exist");
							}

						} catch (Exception e) {
							System.out.println(e.getMessage());
						}

					}
				} else if (option.equalsIgnoreCase("3")) {
					System.out.println("*******Flights*******");
					for (int i = 0; i < flights.length; i++) {
						try {
							System.out.println(flights[i].flightDetail());
						} catch (Exception e) {

						}
					}

				} else if (option.equalsIgnoreCase("4")) {
					System.out.print("Enter origin: ");
					input = new Scanner(System.in);
					String origin = input.nextLine();
					System.out.print("Enter destination: ");
					input = new Scanner(System.in);
					String destination = input.nextLine();
					System.out.println("=====Direct Flights=====");
					for (int i = 0; i < flights.length; i++) {
						try {
							if (flights[i].isDirectFlight(origin, destination)) {
								System.out.println(flights[i].toString());
							}
						} catch (Exception e) {

						}
					}
					System.out.println("=====Indirect Flights=====");
					for (int i = 0; i < flights.length; i++) {
						try {
							if (flights[i].isInDirectFlight(origin, destination)) {
								System.out.println(flights[i].toString());
							}
						} catch (Exception e) {

						}
					}
				} else if (option.equalsIgnoreCase("5")) {
					double min = 1.7976931348623158e+308;

					if (flights.length > 0) {
						System.out.println("Enter date on which you want to know lowest fare seats available");
						int year;
						int month;
						int day;
						while (true) {
							try {
								System.out.print("Enter Year: ");
								input = new Scanner(System.in);
								year = input.nextInt();

								break;
							} catch (Exception e) {
								System.out.println(e);

							}

						}
						while (true) {
							try {
								System.out.print("Enter Month: ");
								input = new Scanner(System.in);
								month = input.nextInt();
								break;
							} catch (Exception e) {
								System.out.println(e);

							}

						}
						while (true) {
							try {
								System.out.print("Enter Day: ");
								input = new Scanner(System.in);
								day = input.nextInt();
								break;
							} catch (Exception e) {
								System.out.println(e);

							}

						}

						Boolean found = false, found1 = false;
						SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

						Date d1;
						try {
							d1 = sdformat.parse(year + "-" + month + "-" + day);

							for (int i = 0; i < flights.length; i++) {
								try {

									if (sdf.format(d1).equals(sdf.format(flights[i].getDepartureDate()))) {
										found = true;
										for (int j = 0; j < flights[i].getVacantseats().size(); j++) {
											if (flights[i].getVacantseats().get(j).getReservationAmount() < min) {
												min = flights[i].getVacantseats().get(j).getReservationAmount();
												found1 = true;

											}

										}

									}
								} catch (Exception e) {

								}
							}
							if (found == false) {
								System.out.println("No flight on this date");
								continue;
							}
							if (found1 == false) {
								System.out.println("No seat available on this day");
								continue;
							}

							for (int i = 0; i < flights.length; i++) {
								try {
									if (sdf.format(d1).equals(sdf.format(flights[i].getDepartureDate()))) {
										for (int j = 0; j < flights[i].getVacantseats().size(); j++) {
											if (flights[i].getVacantseats().get(j).getReservationAmount() == min) {
												System.out.print(flights[i].flightDetail());
												System.out.println(flights[i].getVacantseats().get(j).toString());
											}

										}

									}
								} catch (Exception e) {

								}
							}
						} catch (Exception e) {

						}

					} else {
						System.out.println("No flights exist");
					}
				} else if (option.equalsIgnoreCase("6")) {
					System.out.println("*******Available Seats in all Flights*******");
					for (int i = 0; i < flights.length; i++) {
						try {
							System.out.println(flights[i].toString());
						} catch (Exception e) {

						}
					}
				} else if (option.equalsIgnoreCase("7")) {

					System.out.print("Enter passportnumber of customer whose ticket you want to display: ");
					input = new Scanner(System.in);
					String passportnumber = input.nextLine();

					Boolean found = false;
					System.out.println("Folowing are the reservation of the customer: ");
					for (int i = 0; i < reservations.size(); i++) {
						try {
							if (reservations.get(i).getPassenger().getPassportnumber().equalsIgnoreCase(passportnumber)
									&& reservations.get(i).getStatus()) {
								reservations.get(i).reservationFlightDetail();
								found = true;
							}
						} catch (Exception e) {

						}

					}
					if (found == true) {

						int id;
						while (true) {
							try {
								System.out.println(
										"Against which flight do you want to display ticket Please Enter FlightId");
								input = new Scanner(System.in);
								id = input.nextInt();

								break;
							} catch (Exception e) {
								System.out.println(e);

							}

						}

						System.out.println("Printing Tickets of this Flight");

						for (int i = 0; i < reservations.size(); i++) {
							try {
								if (reservations.get(i).getPassenger().getPassportnumber()
										.equalsIgnoreCase(passportnumber) && reservations.get(i).getStatus()) {
									if (reservations.get(i).getFlight().getFlightId() == id) {
										reservations.get(i).printTicket();
									}

								}
							} catch (Exception e) {

							}

						}
					} else {
						System.out.println("No flight reserved for this customer");
					}

				} else if (option.equalsIgnoreCase("8")) {
					System.out.print("Enter passportnumber of customer whose ticket you want to display: ");
					input = new Scanner(System.in);
					String passportnumber = input.nextLine();

					Boolean found = false;
					System.out.println("Folowing are the reservation of the customer: ");
					for (int i = 0; i < reservations.size(); i++) {
						try {
							if (reservations.get(i).getPassenger().getPassportnumber().equalsIgnoreCase(passportnumber)
									&& reservations.get(i).getStatus()) {
								reservations.get(i).reservationFlightDetail();
								found = true;
							}
						} catch (Exception e) {

						}

					}
					if (found == true) {
						int id;
						while (true) {
							try {
								System.out.println(
										"Which flight reservation do you want to cancel ticket Please Enter FlightId");
								input = new Scanner(System.in);
								id = input.nextInt();
								break;
							} catch (Exception e) {
								System.out.println(e);

							}

						}

						found = false;
						for (int i = 0; i < reservations.size(); i++) {
							try {
								if (reservations.get(i).getPassenger().getPassportnumber()
										.equalsIgnoreCase(passportnumber)) {
									if (reservations.get(i).getFlight().getFlightId() == id
											&& reservations.get(i).getStatus()) {
										reservations.get(i).printTicket();
										found = true;
									}

								}
							} catch (Exception e) {

							}

						}

						if (found == true) {
							System.out
									.println("Which seat reservation do you want to cancel ticket Please Enter SeatId");
							input = new Scanner(System.in);
							String seatid = input.nextLine();
							found = false;
							int index1 = -1;
							for (int i = 0; i < reservations.size(); i++) {
								try {
									if (reservations.get(i).getPassenger().getPassportnumber()
											.equalsIgnoreCase(passportnumber)) {
										if (reservations.get(i).getFlight().getFlightId() == id
												&& reservations.get(i).getStatus() && reservations.get(i)
														.getReservedSeats().getSeatId().equalsIgnoreCase(seatid)) {
											reservations.get(i).setStatus(false);
											index1 = i;
											found = true;

										}

									}
								} catch (Exception e) {

								}

							}
							if (found == true) {
								for (int i = 0; i < flights.length; i++) {
									try {
										if (flights[i].getFlightId() == id) {
											flights[i].getVacantseats()
													.add(reservations.get(index1).getReservedSeats());
											System.out.println("Reservation Cancelled Successfully");
										}
									} catch (Exception e) {

									}
								}
							} else {
								System.out.println("No such seat is reserved for this customer");
							}

						} else {
							System.out.println("No such flight id reserved for this customer");
						}
					} else {
						System.out.println("No flight reserved for this customer");
					}
				} else if (option.equalsIgnoreCase("9")) {
					loginStatusAdmin = false;
					loginStatusCustomer = false;
				} else if (option.equalsIgnoreCase("10")) {
					break;
				} else {
					System.out.println("Invalid Option Selected");
				}

			}
		}

	}

}
