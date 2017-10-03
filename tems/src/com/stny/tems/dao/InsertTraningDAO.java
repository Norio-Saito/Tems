package com.stny.tems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stny.tems.util.DBConnector;

/**
 * traningテーブルに登録するためのクラス
 *
 * @author NORIO SAITO
 * @since 2017/8/27
 * @version 1.0
 */
public class InsertTraningDAO {

	/**
	 * 自動生成されたトレーニングID
	 */
	private int traning_id;

	/**
	 * traningテーブルに入力された情報を登録するメソッド
	 *
	 * @author NORIO SAITO
	 * @since 2017/8/27
	 * @version 1.0
	 * @param name
	 *            トレーニング名
	 * @param category
	 *            練習の局面
	 * @param goal
	 *            トレーニングの目的
	 * @param nop_min
	 *            トレーニング人数の最小値
	 * @param nop_max
	 *            トレーニング人数の最大値
	 * @param organize
	 *            トレーニング範囲
	 * @param traning_text
	 *            トレーニング方法
	 * @param phenomenon
	 *            トレーニング中に見るべきポイント
	 * @param img
	 *            画像パス
	 */
	public int insertTraning(String name, int category, String goal, int nop_min, int nop_max, String organize,
			String traning_text, String phenomenon, int img_count) {
		int count = 0;

		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO traning_main(name, category, goal, nop_min, nop_max,"
				+ "organize, traning_text, phenomenon, img) " + "VALUE(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, name);
			ps.setInt(2, category);
			ps.setString(3, goal);
			ps.setInt(4, nop_min);
			ps.setInt(5, nop_max);
			ps.setString(6, organize);
			ps.setString(7, traning_text);
			ps.setString(8, phenomenon);
			ps.setInt(9, img_count);

			count = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			while (rs.next()) {
				traning_id = rs.getInt(1);
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
		return count;
	}

	public int insertKeyword(String keyword) {
		int count = 0;

		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO keyword_table(t_id, keyword) VALUE(?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, traning_id);
			ps.setString(2, keyword);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}

	public int insertImg(String fileName) {
		int count = 0;
		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO img(t_id, img_path) VALUE(?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, traning_id);
			ps.setString(2, fileName);

			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		return count;
	}

	/**
	 * @return traning_id 自動生成されたトレーニングID
	 */
	public int getTraning_id() {
		return traning_id;
	}

	/**
	 * @param traning_id
	 *            自動生成されたトレーニングIDをセットする traning_id
	 */
	public void setTraning_id(int traning_id) {
		this.traning_id = traning_id;
	}
}
