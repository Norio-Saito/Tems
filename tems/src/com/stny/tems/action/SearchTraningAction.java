package com.stny.tems.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.SearchTraningDAO;
import com.stny.tems.dto.SelectTraningDTO;

/**
 * トレーニングの検索、絞り込みをするアクションクラス
 * @author NORIO SAITO
 * @since 2017/10/06
 * @version 1.1
 */
public class SearchTraningAction extends ActionSupport{

	/**
	 * トレーニングID
	 */
	private String traningId;

	/**
	 * トレーニング名
	 */
	private String name;

	/**
	 * トレーニング種別
	 */
	private String category;

	/**
	 * トレーニング情報のリスト
	 */
	private ArrayList<SelectTraningDTO> traningList = new ArrayList<>();

	/**
	 * トレーニングを検索するメソッド
	 * @author NORIO SAITO
	 * @since 2017/10/06
	 * @return SUCCESS, ERROR 検索できたらサクセス、できなかったらエラー
	 */
	public String excute() {
		String result = ERROR;

		if(traningId == null) {
			traningId = "";
		}
		if(name == null) {
			name = "";
		}
		if(category == null) {
			category = "";
		}

		SearchTraningDAO dao = new SearchTraningDAO();

		if(dao.searchTraning(name, traningId, category)) {

			setTraningList(dao.getTraningList());
		}

		return result;
	}

	/**
	 * @return traningId
	 */
	public String getTraningId() {
		return traningId;
	}

	/**
	 * @param traningId セットする traningId
	 */
	public void setTraningId(String traningId) {
		this.traningId = traningId;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category セットする category
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return traningList
	 */
	public ArrayList<SelectTraningDTO> getTraningList() {
		return traningList;
	}

	/**
	 * @param traningList セットする traningList
	 */
	public void setTraningList(ArrayList<SelectTraningDTO> traningList) {
		this.traningList = traningList;
	}
}
