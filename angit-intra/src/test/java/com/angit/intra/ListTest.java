package com.angit.intra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hy.StarApplication;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StarApplication.class)
@WebAppConfiguration
public class ListTest {
	@Autowired
	private AppRegisterService appRegisterService;

	@Test
	public void testFindList() {
		AppProtocolModel model = new AppProtocolModel();
		try {
			appRegisterService.serchAPPInfoByPage(model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
