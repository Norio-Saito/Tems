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
	 * キーワードを格納するリスト
	 */
	private ArrayList<SelectTraningDTO> keywordList = new ArrayList<>();

	/**
	 * 画像パスを格納するリスト
	 */
	private ArrayList<SelectTraningDTO> pathList = new ArrayList<>();

	/**
	 * 全てのトレーニング情報を取得するメソッド
	 * @author Norio Saito
	 * @since 2017/9/5
	 * @version 1.0
	 * @return true, false
	 */
	public boolean SelectTraningList(String traningId, String name, String category) {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM traning_main where traning_id like ? and name like ? and category like ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			if(traningId == "") {
				ps.setString(1, "%" + traningId + "%");
			}else {
				ps.setString(1, traningId);
			}

			ps.setString(2, "%" + name + "%");
			ps.setString(3, "%" + category + "%");

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
	 * トレーニングを新着順で取得するメソッド
	 * @param traningId
	 * @param name
	 * @param category
	 * @return false, true
	 */
	public boolean selectTraningNewOrder(String traningId, String name, String category) {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM traning_main where traning_id like ? and name like ? and category like ? "
				+ "ORDER BY registration_date DESC";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			if(traningId == "") {
				ps.setString(1, "%" + traningId + "%");
			}else {
				ps.setString(1, traningId);
			}

			ps.setString(2, "%" + name + "%");
			ps.setString(3, "%" + category + "%");

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
	 * トレーニングの画像パスを取得するメソッド
	 * @param traningId
	 * @return false, true
	 */
	public boolean selectImg(int traningId) {
		boolean result = false;

		Connection con = new DBConnector().getConnection();

		String sql = "SELECT * FROM img WHERE traning_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, traningId);

			ResultSet rs = ps.executeQuery();

			SelectTraningDTO dto = new SelectTraningDTO();
			dto.setImgPath(rs.getString("img_path"));

			pathList.add(dto);
			result = true;

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
	 * キーワードを取得するメソッド
	 * @param traningId
	 * @return false, true
	 */
	public boolean selectKeyword(int traningId) {
		boolean result = false;

		Connection con = new DBConnector().getConnection();

		String sql = "SELECT * FROM keyword_table WHERE traning_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, traningId);
			ResultSet rs = ps.executeQuery();

			SelectTraningDTO dto = new SelectTraningDTO();
			dto.setImgPath(rs.getString("keyword"));

			keywordList.add(dto);
			result = true;

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

	/**
	 * @return keywordList
	 */
	public ArrayList<SelectTraningDTO> getKeywordList() {
		return keywordList;
	}

	/**
	 * @param keywordList セットする keywordList
	 */
	public void setKeywordList(ArrayList<SelectTraningDTO> keywordList) {
		this.keywordList = keywordList;
	}

	/**
	 * @return pathList
	 */
	public ArrayList<SelectTraningDTO> getPathList() {
		return pathList;
	}

	/**
	 * @param pathList セットする pathList
	 */
	public void setPathList(ArrayList<SelectTraningDTO> pathList) {
		this.pathList = pathList;
	}
}
