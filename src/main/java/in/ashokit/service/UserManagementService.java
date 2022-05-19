package in.ashokit.service;

import java.util.Map;

import in.ashokit.bindings.LoginForm;
import in.ashokit.bindings.UnlockForm;
import in.ashokit.bindings.UserForm;

public interface UserManagementService {
	
	//Login functionality method
	public String login(LoginForm loginForm);

	//Registration Functionality method
	public String emailCheck(String emailId);

	public Map<Integer,String> loadCountries();
	
	public Map<Integer, String> loadStates(Integer countryId);
	
	public Map<Integer, String> loadCities(Integer stateId);
	
	public	String registerUser(UserForm userForm);

	//unlock  form method
	public String unlockAccount(UnlockForm unlockForm);
	
	public String forgotpswd(String emailId);
}
