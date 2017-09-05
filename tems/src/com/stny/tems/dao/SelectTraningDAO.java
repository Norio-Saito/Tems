package com.stny.tems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.stny.tems.dto.SelectTraningDTO;
import com.stny.tems.util.DBConnector;

/**
	 * トレーニング一覧を取得するクラス
	 * @author Norio Saito
	 *@since 2017/9/5
	 *@version 1.0
	 */
public class SelectTraningDAO {

	/**
	 * トレーニング一覧を格納するリスト
	 */
	private ArrayList<SelectTraningDTO> traningList = new ArrayList<>();

	/**
	 * 全てのトレーニング情報を取得するメソッド
	 * @author Norio Saito
	 * @since 2017/9/5
	 * @version 1.0
	 * @return true, false
	 */
	public boolean SelectTraningList() {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM traning_main ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
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
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * @return traningList トレーニング情報を格納するリスト
	 */
	public ArrayList<SelectTraningDTO> getTraningList() {
		return traningList;
	}

	/**
	 * @param traningList セットする traningList トレーニング情報を格納するリスト
	 */
	public void setTraningList(ArrayList<SelectTraningDTO> traningList) {
		this.traningList = traningList;
	}
}
