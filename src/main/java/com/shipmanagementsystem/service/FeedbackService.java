package com.shipmanagementsystem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.FeedbackDao;
import com.shipmanagementsystem.model.FeedbackQuestionsModel;
import com.shipmanagementsystem.model.FeedbackModel;
import com.shipmanagementsystem.model.FeedbackWithQuestionsModel;



/**
 * The Class FeedbackService.
 */
@Service
public class FeedbackService {

	/** The feedback dao. */
	@Autowired
	private FeedbackDao feedbackDao;

	/**
	 * Post feedback.
	 *
	 * @param feedback the feedback
	 * @return true, if successful
	 */
	public boolean postFeedback(FeedbackModel feedback) {
		return feedbackDao.insertFeedback(feedback);
	}

	/**
	 * Gets the all feedback.
	 *
	 * @return the all feedback
	 */
	public List<FeedbackModel> getAllFeedback() {
		return this.feedbackDao.getAllFeedback();
	}

	/**
	 * Gets the feedback questions.
	 *
	 * @return the feedback questions
	 */
	public FeedbackQuestionsModel getFeedbackQuestions() {
		return this.feedbackDao.getFeedbackQuestions();
	}

	/**
	 * Adds the feedback questions.
	 *
	 * @param model the model
	 * @return true, if successful
	 */
	public boolean addFeedbackQuestions(FeedbackQuestionsModel model) {
		return this.feedbackDao.addFeedbackQuestions(model);
	}

	/**
	 * Gets the feedback with questions.
	 *
	 * @return the feedback with questions
	 */
	public List<FeedbackWithQuestionsModel> getFeedbackWithQuestions() {
		return this.feedbackDao.getFeedbackWithQuestions();
	}
}