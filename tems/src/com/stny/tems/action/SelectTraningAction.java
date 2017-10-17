package com.stny.tems.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.SelectTraningDAO;
import com.stny.tems.dto.SelectTraningDTO;

public class SelectTraningAction extends ActionSupport {

	/**
	 * トレーニング名
	 */
	private String searchName;

	/**
	 * カテゴリー
	 */
	private String searchCategory;

	/**
	 * トレーニング一覧のリスト
	 */
	private ArrayList<SelectTraningDTO> traningList = new ArrayList<>();

	/**
	 * トレーニングID
	 */
	private String searchTraningId;

	/**
	 * 画像パスのリスト
	 */
	private ArrayList<SelectTraningDTO> pathList = new ArrayList<>();

	/**
	 * キーワードのリスト
	 */
	private ArrayList<SelectTraningDTO> keywordList = new ArrayList<>();

	/**
	 * 並び替えフラグ
	 */
	private int sortFlg;

	/**
	 * エラーメッセージ
	 */
	private String err;

	/**
	 * トレーニング一覧を取得できたら、SUCCESSを返すメソッド
	 *
	 * @author user Norio Saito
	 * @since 2017/9/5
	 * @version 1.0
	 * @return SUCCESS, ERROR
	 */
	public String execute() {
		String result = ERROR;

		if (searchName == null) {
			searchName = "";
		}

		if (searchCategory == null) {
			searchCategory = "";
		}

		if (searchTraningId == null) {
			searchTraningId = "";
		}

		/*
		 * 並び替えなし
		 */
		if (sortFlg == 0) {
			SelectTraningDAO dao = new SelectTraningDAO();
			if (dao.SelectTraningList(searchTraningId, searchName, searchCategory)) {
				setTraningList(dao.getTraningList());

				// ページネーション作成の処理を入れるかも

				result = SUCCESS;
			} else {
				err = "該当のトレーニングはありません。";
			}
		} else if (sortFlg == 1) {
			/*
			 * 新着順で並び替え
			 */
			SelectTraningDAO dao = new SelectTraningDAO();
			if (dao.selectTraningNewOrder(searchTraningId, searchName, searchCategory)) {
				setTraningList(dao.getTraningList());

				result = SUCCESS;
			}else {
				err = "該当のトレーニングはありません。";
			}
		}
		System.out.println("検索結果" + result);
		return result;
	}

	/**
	 * @return traningList トレーニング情報を格納するリスト
	 */
	public ArrayList<SelectTraningDTO> getTraningList() {
		return traningList;
	}

	/**
	 * @param traningList
	 *            セットする traningList トレーニング情報を格納するリスト
	 */
	public void setTraningList(ArrayList<SelectTraningDTO> traningList) {
		this.traningList = traningList;
	}

	/**
	 * @return traningId
	 */
	public String getSearchTraningId() {
		return searchTraningId;
	}

	/**
	 * @param traningId
	 *            セットする traningId
	 */
	public void setSearchTraningId(String searchTraningId) {
		this.searchTraningId = searchTraningId;
	}

	/**
	 * @return pathList
	 */
	public ArrayList<SelectTraningDTO> getPathList() {
		return pathList;
	}

	/**
	 * @param pathList
	 *            セットする pathList
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
	 * @param keywordList
	 *            セットする keywordList
	 */
	public void setKeywordList(ArrayList<SelectTraningDTO> keywordList) {
		this.keywordList = keywordList;
	}

	/**
	 * @return name
	 */
	public String getSearchName() {
		return searchName;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	/**
	 * @return category
	 */
	public String getSearchCategory() {
		return searchCategory;
	}

	/**
	 * @param category
	 *            セットする category
	 */
	public void setSearchCategory(String searchCategory) {
		this.searchCategory = searchCategory;
	}

	/**
	 * @return err
	 */
	public String getErr() {
		return err;
	}

	/**
	 * @param err
	 *            セットする err
	 */
	public void setErr(String err) {
		this.err = err;
	}

	/**
	 * @return sortFlg
	 */
	public int getSortFlg() {
		return sortFlg;
	}

	/**
	 * @param sortFlg
	 *            セットする sortFlg
	 */
	public void setSortFlg(int sortFlg) {
		this.sortFlg = sortFlg;
	}

}
