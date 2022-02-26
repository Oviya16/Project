package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.FeedbackQuestionsModel;


/**
 * The Class FeedbackQuestionsMapper.
 */
public class FeedbackQuestionsMapper implements RowMapper<FeedbackQuestionsModel> {

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the feedback questions model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public FeedbackQuestionsModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		FeedbackQuestionsModel model = new FeedbackQuestionsModel();
		model.setqId(rs.getInt("q_id"));
		model.setQues1(rs.getString("ques_1"));
		model.setQues2(rs.getString("ques_2"));
		model.setQues3(rs.getString("ques_3"));
		return model;
	}

}