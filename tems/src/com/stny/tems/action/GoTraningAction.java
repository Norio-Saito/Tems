package com.stny.tems.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.SelectTraningDAO;
import com.stny.tems.dto.SelectTraningDTO;

/**
 * トレーニング詳細画面へ遷移するアクション
 * @author NORIO SAITO
 * @since 2017/10/23
 * @version 1.1
 */
public class GoTraningAction extends ActionSupport{

	/**
	 * 選択されたトレーニングID
	 */
	public String traningId;

	/**
	 * トレーニング情報を格納するリスト
	 */
	public ArrayList<SelectTraningDTO> traningList = new ArrayList<>();


	/**
	 * トレーニング情報を取得するメソッド
	 * @author NORIO SAITO
	 * @since 2017/10/23
	 * @param traningId 選択されたトレーニングID
	 * @return ERROR, SUCCSESS 取得できたらサクセス、できなかったらエラー
	 */
	public String execute() {
		String result = ERROR;


		SelectTraningDAO dao = new SelectTraningDAO();

		if(dao.SelectTraningList(traningId, "", "")) {

			setTraningList(dao.getTraningList());

			result = SUCCESS;
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
