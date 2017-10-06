package com.stny.tems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.stny.tems.dto.SelectTraningDTO;
import com.stny.tems.util.DBConnector;

/**
 * トレーニングを検索、絞り込みするクラス
 *
 * @author NORIO SAITO
 * @since 2017/10/06
 * @version 1.1
 */
public class SearchTraningDAO {

	private ArrayList<SelectTraningDTO> traningList = new ArrayList<>();

	public boolean searchTraning(String traningName, String traningId, String category) {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM traning_main WHERE name LIKE ? and traning_id = ? and category = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "'%" + traningName + "%'");

			if (traningId == "") {
				ps.setString(2, "'%" + traningId + "%'");
			} else {
				ps.setString(2, traningId);
			}

			if (category == "") {
				ps.setString(3, "'%" + category + "%'");
			} else {
				ps.setString(3, category);
			}

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SelectTraningDTO dto = new SelectTraningDTO();

				dto.setTraning_id(rs.getInt("traning_id"));
				dto.setName(rs.getString("name"));
				dto.setCategory(rs.getInt("category"));
				dto.setGoal(rs.getString("goal"));
				dto.setNop_max(rs.getInt("nop_max"));
				dto.setNop_min(rs.getInt("nop_min"));
				dto.setOrganize(rs.getString("organize"));
				dto.setTraning_text(rs.getString("traning_text"));
				dto.setPhenomenon(rs.getString("phenomenon"));
				dto.setImg(rs.getString("img"));
				traningList.add(dto);
				result = true;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * @return traningList
	 */
	public ArrayList<SelectTraningDTO> getTraningList() {
		return traningList;
	}

	/**
	 * @param traningList
	 *            セットする traningList
	 */
	public void setTraningList(ArrayList<SelectTraningDTO> traningList) {
		this.traningList = traningList;
	}
}
