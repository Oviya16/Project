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



/**
 * The Class FeedbackDao.
 */
@Repository
public class FeedbackDao {

	/** The view feedback. */
	private final String VIEW_FEEDBACK = "select * from feedback";
	
	/** The insert feedback. */
	private final String INSERTFEEDBACK = "insert into feedback(user_id,ans_1,ans_2,ans_3,rating,q_id) values(?,?,?,?,?,?);";
	
	/** The get feedback qn. */
	private final String GET_FEEDBACK_QN = "select * from feedbackQuestions where q_id =(select max(q_id) from feedbackQuestions);";
	
	/** The add feedback qn. */
	private final String ADD_FEEDBACK_QN = "insert into feedbackQuestions (ques_1,ques_2,ques_3) values(?,?,?)";
	
	/** The get feedback with qns. */
	private final String GET_FEEDBACK_WITH_QNS = "select * from feedback as f join feedbackQuestions as q on f.q_id = q.q_Id;";

	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Insert feedback.
	 *
	 * @param feedback the feedback
	 * @return true, if successful
	 */
	// remove user-id and venueId and add bookingId
	public boolean insertFeedback(FeedbackModel feedback) {
		if (jdbcTemplate.update(INSERTFEEDBACK, feedback.getUserId(), feedback.getAns1(),
				feedback.getAns2(), feedback.getAns3(), feedback.getRating(), feedback.getqId()) != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Gets the all feedback.
	 *
	 * @return the all feedback
	 */
	public List<FeedbackModel> getAllFeedback() {
		return this.jdbcTemplate.query(VIEW_FEEDBACK, new FeedbackMapper());
	}

	/**
	 * Gets the feedback questions.
	 *
	 * @return the feedback questions
	 */
	public FeedbackQuestionsModel getFeedbackQuestions() {
		return this.jdbcTemplate.queryForObject(GET_FEEDBACK_QN, new FeedbackQuestionsMapper());
	}

	/**
	 * Adds the feedback questions.
	 *
	 * @param model the model
	 * @return true, if successful
	 */
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

	/**
	 * Gets the feedback with questions.
	 *
	 * @return the feedback with questions
	 */
	public List<FeedbackWithQuestionsModel> getFeedbackWithQuestions() {
		List<FeedbackWithQuestionsModel> feedback = new ArrayList<FeedbackWithQuestionsModel>();
		try {
			feedback = this.jdbcTemplate.query(GET_FEEDBACK_WITH_QNS, new FeedbackWithQuestionsMapper());
		} catch (Exception e) {
		}
		return feedback;
	}

}
