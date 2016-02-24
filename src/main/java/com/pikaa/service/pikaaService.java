package com.pikaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pikaa.model.Locations;
import com.pikaa.repository.PikaaRepository;

@Service
@Transactional
public class pikaaService {
	@Autowired
	PikaaRepository pr;
	
	public List<Locations> topNearestLocsList(int zipCode)
	{
		List<Locations> topList = pr.topNearestLocsList(zipCode);
		List<Locations> top5List = new ArrayList<Locations>();
		for(int i=0; i<5; i++)
		{
			top5List.add(topList.get(i));
		}
		return top5List;
	}

}
