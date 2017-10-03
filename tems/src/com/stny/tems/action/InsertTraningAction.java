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
	private ArrayList<File> img_file = new ArrayList<>();

	/**
	 * トレーニング画像名
	 */
	private ArrayList<String> img_fileFileName = new ArrayList<>();

	/**
	 * トレーニング画像形式
	 */
	private ArrayList<String> img_fileContentType = new ArrayList<>();

	/**
	 * キーワード
	 */
	private ArrayList<String> getkeyword = new ArrayList<>();

	/**
	 * DBに保存する画像パス
	 */
	private String fileName;

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

System.out.println("img_data:" + img_file.size());
System.out.println("fileNameList" + img_fileFileName.size());

		if (dao.insertTraning(name, category, goal, nop_min, nop_max, organize, traning_text, phenomenon, img_file.size()) > 0) {

			//トレーニング画像を入力された分コピー
			for(int i = 0; i < img_file.size(); i++) {
				String basePath = request.getServletContext().getRealPath("/");

				try {
				File traning_destFile = new File(basePath + "img\\", img_fileFileName.get(i));
				FileUtils.copyFile(img_file.get(i), traning_destFile);
				fileName = basePath + "img\\" + img_fileFileName.get(i);

				}catch(IOException e) {
					e.printStackTrace();
				}

				if(dao.insertImg(fileName) > 0) {
					result = SUCCESS;
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

	public ArrayList<File> getImg_file() {
		return img_file;
	}

	public void setImg_file(ArrayList<File> img_file) {
		this.img_file = img_file;
	}

	public ArrayList<String> getImg_fileFileName() {
		return img_fileFileName;
	}

	public void setImg_fileFileName(ArrayList<String> img_fileFileName) {
		this.img_fileFileName = img_fileFileName;
	}

	public ArrayList<String> getImg_fileContentType() {
		return img_fileContentType;
	}

	public void setImg_fileContentType(ArrayList<String> img_fileContentType) {
		this.img_fileContentType = img_fileContentType;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	/**
	 * @return fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName セットする fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @param request セットする request
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

}
