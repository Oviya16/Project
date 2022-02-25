package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.FeedbackWithQuestionsModel;

public class FeedbackWithQuestionsMapper implements RowMapper<FeedbackWithQuestionsModel> {

	@Override
	public FeedbackWithQuestionsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		FeedbackWithQuestionsModel model = new FeedbackWithQuestionsModel();
		model.setAns1(rs.getString("ans_1"));
		model.setAns2(rs.getString("ans_2"));
		model.setAns3(rs.getString("ans_3"));
		model.setFeedbackId(rs.getString("feedback_id"));
		model.setqId(rs.getInt("q_id"));
		model.setQues1(rs.getString("ques_1"));
		model.setQues2(rs.getString("ques_2"));
		model.setQues3(rs.getString("ques_3"));
		model.setRating(rs.getString("rating"));
		model.setUserId(rs.getString("user_id"));
		return model;
	}

}