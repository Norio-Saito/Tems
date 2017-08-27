package com.stny.tems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.stny.tems.util.DBConnector;

/**
 * traningテーブルに登録するためのクラス
 * @author NORIO SAITO
 *@since 2017/8/27
 *@version 1.0
 */
public class InsertTraningDAO {

	/**
	 * traningテーブルに入力された情報を登録するメソッド
	 * @author NORIO SAITO
	 * @since 2017/8/27
	 * @version 1.0
	 * @param traning_name トレーニング名
	 * @param offence メニューフラグ（攻撃）
	 * @param defence メニューフラグ（守備）
	 * @param gk メニューフラグ（ゴールキーパー）
	 * @param phygical メニューフラグ（フィジカル）
	 * @param person トレーニング人数
	 * @param traning_text トレーニング人数
	 * @param key_word キーワード
	 * @param image_path 画像パス
	 */
	public int insertTraning(String traning_name, int offence, int defence, int gk,
			int phygical, String person, String traning_text, String key_word, String image_path) {
		int count = 0;

		Connection con = DBConnector.getConnection();
		String sql = "INSERT INTO traning(traning_name, offence, defence, gk, phygical,"
				+ "person, traning_text, key_word, traning_image) "
				+ "VALUE(?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, traning_name);
			ps.setInt(2, offence);
			ps.setInt(3, defence);
			ps.setInt(4, gk);
			ps.setInt(5, phygical);
			ps.setString(6, person);
			ps.setString(7, traning_text);
			ps.setString(8, key_word);
			ps.setString(9, image_path);

			System.out.println(sql);

			count = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return count;
	}
}
