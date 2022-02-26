package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.WalletModel;


/**
 * The Class WalletMapper.
 */
public class WalletMapper implements RowMapper<WalletModel>{

	/**
	 * Map row.
	 *
	 * @param rs the rs
	 * @param rowNum the row num
	 * @return the wallet model
	 * @throws SQLException the SQL exception
	 */
	@Override
	public WalletModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		WalletModel wallet= new WalletModel();
		wallet.setId(rs.getInt("id"));
		wallet.setTotalAmount(rs.getDouble("total_amount"));
		return wallet;
	}

}
