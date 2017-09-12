package com.stny.tems.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.InsertTraningDAO;

public class InsertTraningAction extends ActionSupport {

	/**
	 * トレーニング名
	 */
	private String name;

	/**
	 * 練習の局面
	 */
	private int category;

	/**
	 * トレーニングの目的
	 */
	private String goal;

	/**
	 * トレーニング参加人数の最小値
	 */
	private int nop_min;

	/**
	 * トレーニング参加人数の最大値
	 */
	private int nop_max;

	/**
	 * トレーニング範囲
	 */
	private String organize;

	/**
	 * トレーニング方法
	 */
	private String traning_text;

	/**
	 * トレーニング中に見るポイント
	 */
	private String phenomenon;

	/**
	 * トレーニングイメージ
	 */
	private String img;

	/**
	 * キーワード
	 */
	private ArrayList<String> getkeyword = new ArrayList<>();

	/**
	 * トレーニングの情報を登録できたらSUCCESSを返す
	 *
	 * @author NORIO SAITO
	 * @since 2017/8/27
	 * @version 1.0
	 * @return ERROR, SUCCESS
	 */
	public String execute() {
		String result = ERROR;

		InsertTraningDAO dao = new InsertTraningDAO();

		if (dao.insertTraning(name, category, goal, nop_min, nop_max, organize, traning_text, phenomenon, img) > 0) {

			for (int i = 0; i < getkeyword.size(); i++) {

				String keyword = getkeyword.get(i);
				if (dao.insertKeyword(keyword) > 0) {

					result = SUCCESS;
				}
			}
		}
		return result;
	}

	/**
	 * @return name トレーニング名
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする トレーニング名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return category 練習の局面
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            セットする 練習の局面
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return goal トレーニングの目的
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * @param goal
	 *            セットする トレーニングの目的
	 */
	public void setGoal(String goal) {
		this.goal = goal;
	}

	/**
	 * @return nop_min トレーニング参加人数の最小値
	 */
	public int getNop_min() {
		return nop_min;
	}

	/**
	 * @param nop_min
	 *            セットする トレーニング参加人数の最小値
	 */
	public void setNop_min(int nop_min) {
		this.nop_min = nop_min;
	}

	/**
	 * @return nop_max トレーニング参加人数の最大値
	 */
	public int getNop_max() {
		return nop_max;
	}

	/**
	 * @param nop_max
	 *            セットする トレーニング参加人数の最大値
	 */
	public void setNop_max(int nop_max) {
		this.nop_max = nop_max;
	}

	/**
	 * @return organize トレーニング範囲
	 */
	public String getOrganize() {
		return organize;
	}

	/**
	 * @param organize
	 *            セットする トレーニング範囲
	 */
	public void setOrganize(String organize) {
		this.organize = organize;
	}

	/**
	 * @return phenomenon トレーニング中に見るべきポイント
	 */
	public String getPhenomenon() {
		return phenomenon;
	}

	/**
	 * @param phenomenon
	 *            セットする phenomenon
	 */
	public void setPhenomenon(String phenomenon) {
		this.phenomenon = phenomenon;
	}

	/**
	 * @return img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img
	 *            セットする img
	 */
	public void setImg(String img) {
		this.img = img;
	}



	/**
	 * @return getkeyword
	 */
	public ArrayList<String> getGetkeyword() {
		return getkeyword;
	}

	/**
	 * @param getkeyword セットする getkeyword
	 */
	public void setGetkeyword(ArrayList<String> getkeyword) {
		this.getkeyword = getkeyword;
	}

	/**
	 * @return traning_text トレーニング方法
	 */
	public String getTraning_text() {
		return traning_text;
	}

	/**
	 * @param traning_text
	 *            セットする traning_text トレーニング方法
	 */
	public void setTraning_text(String traning_text) {
		this.traning_text = traning_text;
	}

}
