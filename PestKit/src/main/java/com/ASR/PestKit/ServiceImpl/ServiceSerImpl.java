package com.ASR.PestKit.ServiceImpl;

import com.ASR.PestKit.DAO.ServiceRepository;
import com.ASR.PestKit.Model.Service;
import com.ASR.PestKit.Service.ServiceSer;
import com.ASR.PestKit.Validator.ServiceValidation;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceSerImpl implements ServiceSer {
	@Autowired
	ServiceRepository serviceRepository;

	@Autowired
	ServiceValidation serviceValidation;

	@Override
	public Service addService(Service service) throws Exception {
		serviceValidation.serviceValid1(service);
		serviceValidation.serviceValid2(service);
		return serviceRepository.save(service);



	}
}