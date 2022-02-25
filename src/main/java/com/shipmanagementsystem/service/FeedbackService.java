package com.shipmanagementsystem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipmanagementsystem.dao.FeedbackDao;
import com.shipmanagementsystem.model.FeedbackQuestionsModel;
import com.shipmanagementsystem.model.FeedbackModel;
import com.shipmanagementsystem.model.FeedbackWithQuestionsModel;

@Service
public class FeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;

	public boolean postFeedback(FeedbackModel feedback) {
		return feedbackDao.insertFeedback(feedback);
	}

	public List<FeedbackModel> getAllFeedback() {
		return this.feedbackDao.getAllFeedback();
	}

	public FeedbackQuestionsModel getFeedbackQuestions() {
		return this.feedbackDao.getFeedbackQuestions();
	}

	public boolean addFeedbackQuestions(FeedbackQuestionsModel model) {
		return this.feedbackDao.addFeedbackQuestions(model);
	}

	public List<FeedbackWithQuestionsModel> getFeedbackWithQuestions() {
		return this.feedbackDao.getFeedbackWithQuestions();
	}
}