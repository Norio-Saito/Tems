package com.stny.tems.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.stny.tems.dao.InsertTraningDAO;

public class InsertTraningAction extends ActionSupport implements ServletRequestAware{

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
	 * トレーニングイメージデータ
	 */
	private ArrayList<File> img_dataList = new ArrayList<>();

	/**
	 * トレーニング画像名
	 */
	private ArrayList<String> img_fileFileNameList = new ArrayList<>();

	/**
	 * トレーニング画像形式
	 */
	private ArrayList<String> img_fileContentTypeList = new ArrayList<>();

	/**
	 * キーワード
	 */
	private ArrayList<String> getkeyword = new ArrayList<>();

    /**
     * リクエスト
     */
    private HttpServletRequest request;

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

System.out.println(img_dataList.size());

		if (dao.insertTraning(name, category, goal, nop_min, nop_max, organize, traning_text, phenomenon, img_dataList.size()) > 0) {

			//トレーニング画像を入力された分コピー
			for(int i = 0; i < img_dataList.size(); i++) {
				String basePath = request.getServletContext().getRealPath("/");

				try {
				File traning_destFile = new File(basePath + "img\\", img_fileFileNameList.get(i));
				FileUtils.copyFile(img_dataList.get(i), traning_destFile);

				System.out.println("ベースパス" + basePath);
				System.out.println("ですとファイル" + traning_destFile);

				}catch(IOException e) {
					e.printStackTrace();
				}
			}

			//キーワードを入力された数分インサート
			for (int i = 0; i < getkeyword.size(); i++) {

				String keyword = getkeyword.get(i);
				System.out.println(keyword);
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

	public ArrayList<File> getImg_dataList() {
		return img_dataList;
	}

	public void setImg_dataList(ArrayList<File> img_dataList) {
		this.img_dataList = img_dataList;
	}

	public ArrayList<String> getImg_fileFileNameList() {
		return img_fileFileNameList;
	}

	public void setImg_fileFileNameList(ArrayList<String> img_fileFileNameList) {
		this.img_fileFileNameList = img_fileFileNameList;
	}

	public ArrayList<String> getImg_fileContentTypeList() {
		return img_fileContentTypeList;
	}

	public void setImg_fileContentTypeList(ArrayList<String> img_fileContentTypeList) {
		this.img_fileContentTypeList = img_fileContentTypeList;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
