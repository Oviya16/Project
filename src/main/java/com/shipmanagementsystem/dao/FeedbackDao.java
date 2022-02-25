package com.shipmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shipmanagementsystem.mapper.FeedbackMapper;
import com.shipmanagementsystem.mapper.FeedbackQuestionsMapper;
import com.shipmanagementsystem.mapper.FeedbackWithQuestionsMapper;
import com.shipmanagementsystem.model.FeedbackModel;
import com.shipmanagementsystem.model.FeedbackQuestionsModel;
import com.shipmanagementsystem.model.FeedbackWithQuestionsModel;

@Repository
public class FeedbackDao {

	private final String VIEW_FEEDBACK = "select * from feedback";
	private final String INSERTFEEDBACK = "insert into feedback(user_id,ans_1,ans_2,ans_3,rating,q_id) values(?,?,?,?,?,?);";
	private final String GET_FEEDBACK_QN = "select * from feedbackQuestions where q_id =(select max(q_id) from feedbackQuestions);";
	private final String ADD_FEEDBACK_QN = "insert into feedbackQuestions (ques_1,ques_2,ques_3) values(?,?,?)";
	private final String GET_FEEDBACK_WITH_QNS = "select * from feedback as f join feedbackQuestions as q on f.q_id = q.q_Id;";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// remove user-id and venueId and add bookingId
	public boolean insertFeedback(FeedbackModel feedback) {
		if (jdbcTemplate.update(INSERTFEEDBACK, feedback.getUserId(), feedback.getAns1(),
				feedback.getAns2(), feedback.getAns3(), feedback.getRating(), feedback.getqId()) != 0) {
			return true;
		}
		return false;
	}

	public List<FeedbackModel> getAllFeedback() {
		return this.jdbcTemplate.query(VIEW_FEEDBACK, new FeedbackMapper());
	}

	public FeedbackQuestionsModel getFeedbackQuestions() {
		return this.jdbcTemplate.queryForObject(GET_FEEDBACK_QN, new FeedbackQuestionsMapper());
	}

	public boolean addFeedbackQuestions(FeedbackQuestionsModel model) {
		boolean status;
		try {
			status = this.jdbcTemplate.update(ADD_FEEDBACK_QN, model.getQues1(), model.getQues2(),
					model.getQues3()) != 0;
		} catch (Exception e) {
			status = false;
		}
		return status;
	}

	public List<FeedbackWithQuestionsModel> getFeedbackWithQuestions() {
		List<FeedbackWithQuestionsModel> feedback = new ArrayList<FeedbackWithQuestionsModel>();
		try {
			feedback = this.jdbcTemplate.query(GET_FEEDBACK_WITH_QNS, new FeedbackWithQuestionsMapper());
		} catch (Exception e) {
		}
		return feedback;
	}

}
