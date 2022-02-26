package com.shipmanagementsystem.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.shipmanagementsystem.model.WalletModel;

public class WalletMapper implements RowMapper<WalletModel>{

	@Override
	public WalletModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		WalletModel wallet= new WalletModel();
		wallet.setId(rs.getInt("id"));
		wallet.setTotalAmount(rs.getDouble("total_amount"));
		return wallet;
	}

}
