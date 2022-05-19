package in.ashokit.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserForm {

	private String fname;
	
	private String lname;
	
	private String email;

	private String phno;
	
	private LocalDate dob;
	
	private String gender;
	
	private String cityId;
	
	private String stateId;
	
	private String countryId;
	
}
