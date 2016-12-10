package kn145.poprygin.web;


import java.util.Properties;

import kn145.poprygin.db.DaoFactory;
import kn145.poprygin.db.MockDaoFactory;
import com.mockobjects.dynamic.Mock;
import com.mockrunner.servlet.BasicServletTestCaseAdapter;

public abstract class MockServletTestCase extends BasicServletTestCaseAdapter {
	
	private Mock mockUserDao;

	public Mock getMockUserDao() {
		return mockUserDao;
	}

	public void setMockUserDao(Mock mockUserDao) {
		this.mockUserDao = mockUserDao;
	}

	
	public void setUp() throws Exception {
		super.setUp();
		Properties properties = new Properties();
		properties.setProperty("dao.factory", MockDaoFactory.class.getName());
		DaoFactory.init(properties);
		setMockUserDao(((MockDaoFactory)DaoFactory.getInstance()).getMockUserDao());
	}

	
	public void tearDown() throws Exception {
		getMockUserDao().verify();
		super.tearDown();
	}

}
