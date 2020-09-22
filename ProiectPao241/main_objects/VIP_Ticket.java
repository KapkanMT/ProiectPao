package main_objects;

public class VIP_Ticket extends Ticket{
	VIP_Ticket(Movie movie, Client client, OccupiedSeat occupied_seat) {
		super(movie, client, occupied_seat);
		price += 0.25 * price;
		key_code += "^VP";
	}
}
