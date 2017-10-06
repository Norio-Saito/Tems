package com.stny.tems.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.SelectTraningDAO;
import com.stny.tems.dto.SelectTraningDTO;

public class SelectTraningAction extends ActionSupport{

	/**
	 * トレーニング一覧のリスト
	 */
	private ArrayList<SelectTraningDTO> traningList = new ArrayList<>();

	/**
	 * トレーニングID
	 */
	private String traningId;

	/**
	 * 画像パスのリスト
	 */
	private ArrayList<SelectTraningDTO> pathList = new ArrayList<>();

	/**
	 * キーワードのリスト
	 */
	private ArrayList<SelectTraningDTO> keywordList = new ArrayList<>();


	/**
	 * トレーニング一覧を取得できたら、SUCCESSを返すメソッド
	 * @author user Norio Saito
	 * @since 2017/9/5
	 * @version 1.0
	 * @return SUCCESS, ERROR
	 */
	public String execute() {
		String result = ERROR;

//		if(traning_id == null) {
//			traning_id = "";
//		}

		SelectTraningDAO dao = new SelectTraningDAO();
		if(dao.SelectTraningList()) {
			setTraningList(dao.getTraningList());;

			//ページネーション作成の処理を入れるかも

			result = SUCCESS;
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
	 * @return traning_id トレーニングID
	 */
//	public String getTraning_id() {
//		return traning_id;
//	}
//
//	/**
//	 * @param traning_id トレーニングIDをセットする traning_id トレーニングID
//	 */
//	public void setTraning_id(String traning_id) {
//		this.traning_id = traning_id;
//	}
}
