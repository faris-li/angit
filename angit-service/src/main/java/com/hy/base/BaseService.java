package com.hy.base;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.hy.mapper.AppOrdersDtoMapper;
import com.hy.mapper.AppProtocolDtoMapper;
import com.hy.mapper.SysReqLogDtoMapper;

/**
 * Service基类
 *
 * @param <D>
 *            the type parameter
 * @param <T>
 *            the type parameter
 * @author
 */
@Transactional(readOnly = true)
public abstract class BaseService {

	@Autowired
	protected AppProtocolDtoMapper appProtocolDtoMapper;
	@Autowired
	protected AppOrdersDtoMapper ordersDtoMapper;
	@Autowired
	protected SysReqLogDtoMapper sysReqLogDtoMapper;

	protected BigDecimal str2BigDecimal(String val) {
		BigDecimal decimal = new BigDecimal(val);
		decimal = decimal.setScale(3, BigDecimal.ROUND_HALF_DOWN);
		return decimal;
	}

	public DozerBeanMapper dozerBean() {
		List<String> mappingFiles = Arrays.asList("dozerBeanMapping_service.xml");

		DozerBeanMapper dozerBean = new DozerBeanMapper();
		dozerBean.setMappingFiles(mappingFiles);
		return dozerBean;
	}
}
