package com.example.service;

import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.entity.Plan;
import com.example.entity.Plancategories;
import com.example.repo.Plancategoriesrepo;
import com.example.repo.Planrepository;

@Service
public class PlanServiceimpl implements Planservice {
	@Autowired
	private Planrepository repo;
	@Autowired
	private Plancategoriesrepo pcrepo;

	public Map<Integer, String> getplancategory() {
		Map<Integer, String> map = new HashMap<>();
		List<Plancategories> plancategoris = pcrepo.findAll();
		plancategoris.forEach(plancategory -> {
			map.put(plancategory.getPcid(), plancategory.getPcname());
		});
		return map;
	}

	public String upsertplan(Plan plan) {
		Integer id = plan.getPlanid();
		// System.out.println(plan);
		repo.save(plan);
		System.out.println(plan);
		if (id == null)
			return "record inserted";
		else
			return "record updated";

	}

	public Optional<Plan> getplan(Integer planid) {

		return repo.findById(planid);

	}

	public List<Plan> getAllplans() {

		return repo.findAll();
	}

	public String deleteplan(Integer planid) {
		repo.deleteById(planid);
		return "record deleted";
	}

	public String changestatus(Integer planid, Character status) {
		Optional<Plan> plan = repo.findById(planid);
		Plan plan2 = plan.get();
		plan2.setStatuswith(status);
		repo.save(plan2);
		return "status changed";
	}

}
