package com.angit.intra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.pagehelper.Page;
import com.hy.StarApplication;
import com.hy.dto.AppProtocolDto;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StarApplication.class)
@WebAppConfiguration
public class AppTest {

	@Autowired
	private AppRegisterService appRegisterService;

	@Test
	public void testFindList() {
		System.out.println("appRegisterService:" + appRegisterService);
		AppProtocolModel model = new AppProtocolModel();
		try {
			Page<AppProtocolDto> page = appRegisterService.serchAPPInfoByPage(model);
			System.out.println(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}