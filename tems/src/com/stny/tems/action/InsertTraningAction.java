package com.stny.tems.action;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.InsertTraningDAO;

public class InsertTraningAction extends ActionSupport{

	/**
	 * トレーニング名
	 */
	private String traning_name;

	/**
	 * メニューフラグ（攻撃）
	 */
	private int offence;

	/**
	 * メニューフラグ（守備系）
	 */
	private int defence;

	/**
	 * メニューフラグ（ゴールキーパー）
	 */
	private int gk;

	/**
	 * メニューフラグ（フィジカル）
	 */
	private int phygical;

	/**
	 * トレーニング人数
	 */
	private String person;

	/**
	 * トレーニング内容
	 */
	private String traning_text;

	/**
	 * キーワード
	 */
	private String key_word;

	/**
	 * 画像パス
	 */
	private String image_path;

	/**
	 * トレーニングの情報を登録できたらSUCCESSを返す
	 * @author NORIO SAITO
	 * @since 2017/8/27
	 * @version 1.0
	 * @return ERROR, SUCCESS
	 */
	public String execute() {
		String result = ERROR;

		InsertTraningDAO dao = new InsertTraningDAO();

		if(dao.insertTraning(traning_name, offence, defence, gk,phygical,
				person,traning_text, key_word, image_path) > 0) {
			result = SUCCESS;
		}
		return result;
	}

	/**
	 * @return traning_name トレーニング名
	 */
	public String getTraning_name() {
		return traning_name;
	}

	/**
	 * @param traning_name セットする トレーニング名
	 */
	public void setTraning_name(String traning_name) {
		this.traning_name = traning_name;
	}

	/**
	 * @return メニューフラグ（攻撃系）
	 */
	public int getOffence() {
		return offence;
	}

	/**
	 * @param offence セットする メニューフラグ（攻撃系）
	 */
	public void setOffence(int offence) {
		this.offence = offence;
	}

	/**
	 * @return メニューフラグ（守備系）
	 */
	public int getDefence() {
		return defence;
	}

	/**
	 * @param defence セットする メニューフラグ（守備系）
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}

	/**
	 * @return メニューフラグ（ゴールキーパー）
	 */
	public int getGk() {
		return gk;
	}

	/**
	 * @param gk セットする メニューフラグ（ゴールキーパー）
	 */
	public void setGk(int gk) {
		this.gk = gk;
	}

	/**
	 * @return メニューフラグ（フィジカル）
	 */
	public int getPhygical() {
		return phygical;
	}

	/**
	 * @param phygical セットする メニューフラグ（フィジカル）
	 */
	public void setPhygical(int phygical) {
		this.phygical = phygical;
	}

	/**
	 * @return トレーニング人数
	 */
	public String getPerson() {
		return person;
	}

	/**
	 * @param person セットする トレーニング人数
	 */
	public void setPerson(String person) {
		this.person = person;
	}

	/**
	 * @return トレーニング内容
	 */
	public String getTraning_text() {
		return traning_text;
	}

	/**
	 * @param traning_text セットする トレーニング内容
	 */
	public void setTraning_text(String traning_text) {
		this.traning_text = traning_text;
	}

	/**
	 * @return キーワード
	 */
	public String getKey_word() {
		return key_word;
	}

	/**
	 * @param key_word セットする キーワード
	 */
	public void setKey_word(String key_word) {
		this.key_word = key_word;
	}

	/**
	 * @return 画像パス
	 */
	public String getImage_path() {
		return image_path;
	}

	/**
	 * @param image_path セットする 画像パス
	 */
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
}
