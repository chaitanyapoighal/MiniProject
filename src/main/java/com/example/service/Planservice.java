package com.example.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.example.entity.Plan;

public interface Planservice{
	public Map<Integer, String> getplancategory();
	public String upsertplan(Plan plan);
	public Optional<Plan> getplan(Integer planid);
	public List<Plan> getAllplans();
	public String deleteplan(Integer planid);
	public String changestatus(Integer planid,Character status);

}
