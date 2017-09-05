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
	 * トレーニング一覧を取得できたら、SUCCESSを返すメソッド
	 * @author user Norio Saito
	 * @since 2017/9/5
	 * @version 1.0
	 * @return SUCCESS, ERROR
	 */
	public String execute() {
		String result = ERROR;

		SelectTraningDAO dao = new SelectTraningDAO();
		if(dao.SelectTraningList()) {
			setTraningList(dao.getTraningList());

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
}
