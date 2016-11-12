package kn145.poprygin;

//import static org.junit.Assert.*;

//import org.junit.Before;
//import org.junit.Test;
import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;

public class UserTest extends TestCase {

	private User user;
	private Date dateOfBirthd;

	protected void setUp() throws Exception {
		super.setUp();
		user = new User();

		Calendar calendar = Calendar.getInstance();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirthd = calendar.getTime();
	}

	public void testGetFullName() {
		user.setFirstName("John");
		user.setLastName("Doe");
		assertEquals("Doe, John", user.getFullName());
	}

	public void testGetAge() {
		user.setDateOfBirthd(dateOfBirthd);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		assertEquals(currentYear - 1984, user.getAge());
	}
}
