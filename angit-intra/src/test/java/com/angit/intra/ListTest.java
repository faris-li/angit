package com.angit.intra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hy.StarApplication;
import com.hy.model.AppOrdersModel;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppOrderService;
import com.hy.service.AppRegisterService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StarApplication.class)
@WebAppConfiguration
public class ListTest {
	@Autowired
	private AppRegisterService appRegisterService;
	@Autowired
	private AppOrderService appOrderService;

	@Test
	public void testFindList() {
		AppProtocolModel model = new AppProtocolModel();
		model.setAppName("渠道");
		
		AppOrdersModel modela = new AppOrdersModel();
		try {
//			appRegisterService.getAPPInfoById("30");
//			appRegisterService.serchAPPInfoByPage(model);
			
			appOrderService.getAppOrdersModel("2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
