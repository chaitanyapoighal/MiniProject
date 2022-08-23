package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
//import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Plan;
import com.example.service.PlanServiceimpl;

@RestController
public class ProjectController {
	@Autowired
	PlanServiceimpl planserviceimpl;

	@GetMapping("/")
	public ResponseEntity<List<Plan>> getplansmsg() {
		List<Plan> plans = planserviceimpl.getAllplans();
		return new ResponseEntity<>(plans, HttpStatus.OK);

	}

	@GetMapping("/planid/{id}")
	public ResponseEntity<Optional<Plan>> getplan(@PathVariable("id") Integer id) {
		Optional<Plan> plan = planserviceimpl.getplan(id);
		return new ResponseEntity<>(plan, HttpStatus.OK);
	}

	@PostMapping("/plansave")
	public ResponseEntity<String> saveplan(@RequestBody Plan plan) {
		String msg = planserviceimpl.upsertplan(plan);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updatepaln(@RequestBody Plan plan) {

		String msg = planserviceimpl.upsertplan(plan);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@GetMapping("/planid/{id}/{status}")
	public ResponseEntity<String> statuschangeplan(@PathVariable("id") Integer id, @PathVariable("status") Character status) {
		String msg = planserviceimpl.changestatus(id, status);

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteplanid(@PathVariable("id") Integer id) {
		String msg = planserviceimpl.deleteplan(id);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
