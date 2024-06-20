package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exeptions.DomainExeption;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	//Está como static para não ficar criando novos "sdf" para cada objeto criado. O "sdf" só vai ser criado uma vez 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExeption{
		//Ter essa lógica aqui garante que antes mesmo que seja criado o construtor, seja feita uma validação dos dados 
		if(!checkOut.after(checkIn)) {
			throw new DomainExeption("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//Pega a diferença, em milisegundos, entre as datas e deposi transforma para dias
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainExeption {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			//return "Reservation dates for update must be future dates";
			//Agora um erro será LANÇADO no programa, ao invés de um retorno de um método
			throw new DomainExeption("Reservation dates for update must be future dates");
		} 
		if(!checkOut.after(checkIn)) {
			throw new DomainExeption("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}


