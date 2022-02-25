package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.model.FeedbackModel;
import com.shipmanagementsystem.model.FeedbackQuestionsModel;
import com.shipmanagementsystem.service.FeedbackService;

@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/UserFeedback")
	public ResponseEntity<Object> postFeedback(@RequestBody FeedbackModel model) {
		try {
			boolean status = feedbackService.postFeedback(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getFeedback")
	public ResponseEntity<Object> getAllFeedback() {
		return new ResponseEntity<Object>(this.feedbackService.getAllFeedback(), HttpStatus.OK);
	}

	@GetMapping("/feedbackQns")
	public ResponseEntity<Object> getFeedbackQuestions() {
		return new ResponseEntity<Object>(this.feedbackService.getFeedbackQuestions(), HttpStatus.OK);
	}

	@PostMapping("/feedbackQns")
	public ResponseEntity<Object> addFeedbackQuestions(@RequestBody FeedbackQuestionsModel model) {
		boolean status = this.feedbackService.addFeedbackQuestions(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getFeedbackWithQns")
	public ResponseEntity<Object> getFeedbackWithQuestions() {
		return new ResponseEntity<Object>(this.feedbackService.getFeedbackWithQuestions(), HttpStatus.OK);
	}

}
