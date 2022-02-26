package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.FeedbackModel;

public class FeedbackMapper implements RowMapper<FeedbackModel> {

	/**
	 * Map row.
	 *
	 * @param resultSet the result set
	 * @param i the i
	 * @return the feedback model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public FeedbackModel mapRow(ResultSet resultSet, int i) throws SQLException {

		FeedbackModel feedback = new FeedbackModel();
		feedback.setFeedbackId(resultSet.getString("feedback_id"));
		feedback.setUserId(resultSet.getString("user_id"));
		feedback.setAns1(resultSet.getString("ans_1"));
		feedback.setAns2(resultSet.getString("ans_2"));
		feedback.setAns3(resultSet.getString("ans_3"));
		feedback.setRating(resultSet.getString("rating"));
		feedback.setqId(resultSet.getInt("q_id"));
		return feedback;

	}
}