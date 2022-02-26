package com.shipmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shipmanagementsystem.exceptions.ResourceNotFoundException;
import com.shipmanagementsystem.model.FeedbackModel;
import com.shipmanagementsystem.model.FeedbackQuestionsModel;
import com.shipmanagementsystem.service.FeedbackService;


/**
 * The Class FeedbackController.
 */
@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class FeedbackController {

	/** The feedback service. */
	@Autowired
	private FeedbackService feedbackService;

	/**
	 * Post feedback.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/UserFeedback")
	public ResponseEntity<Object> postFeedback(@RequestBody FeedbackModel model) {
		
			boolean status = feedbackService.postFeedback(model);
			if (status) {
				return new ResponseEntity<Object>(model, HttpStatus.CREATED);
			}
			 throw new ResourceNotFoundException("Failed to get Feedback");
	}

	/**
	 * Gets the all feedback.
	 *
	 * @return the all feedback
	 */
	@GetMapping("/getFeedback")
	public ResponseEntity<Object> getAllFeedback() {
		return new ResponseEntity<Object>(this.feedbackService.getAllFeedback(), HttpStatus.OK);
	}

	/**
	 * Gets the feedback questions.
	 *
	 * @return the feedback questions
	 */
	@GetMapping("/feedbackQns")
	public ResponseEntity<Object> getFeedbackQuestions() {
		return new ResponseEntity<Object>(this.feedbackService.getFeedbackQuestions(), HttpStatus.OK);
	}

	/**
	 * Adds the feedback questions.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/feedbackQns")
	public ResponseEntity<Object> addFeedbackQuestions(@RequestBody FeedbackQuestionsModel model) {
		boolean status = this.feedbackService.addFeedbackQuestions(model);
		if (status) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			throw new ResourceNotFoundException("Failed to add Feedback Question(s)");
		}
	}

	/**
	 * Gets the feedback with questions.
	 *
	 * @return the feedback with questions
	 */
	@GetMapping("/getFeedbackWithQns")
	public ResponseEntity<Object> getFeedbackWithQuestions() {
		return new ResponseEntity<Object>(this.feedbackService.getFeedbackWithQuestions(), HttpStatus.OK);
	}

}
