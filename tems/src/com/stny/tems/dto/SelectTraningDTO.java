package com.stny.tems.dto;

/**
 * トレーニングテーブルの情報を格納するクラス
 * @author Norio Saito
 * @since 2017/9/5
 * @version 1.0
 *
 */
public class SelectTraningDTO {

	/**
	 * トレーニングID
	 */
	private int traning_id;

	/**
	 * トレーニング名
	 */
	private String name;

	/**
	 * トレーニング種別
	 */
	private int category;

	/**
	 * トレーニングの目標
	 */
	private String goal;

	/**
	 * トレーニングの最大人数
	 */
	private int nop_max;

	/**
	 * トレーニングの最小人数
	 */
	private int nop_min;

	/**
	 * トレーニング範囲
	 */
	private String organize;

	/**
	 * トレーニング内容
	 */
	private String traning_text;

	/**
	 * トレーニングの見るべきポイント
	 */
	private String phenomenon;

	/**
	 * トレーニング画像の枚数
	 */
	private String img;

	/**
	 * トレーニング画像のパス
	 */
	private String imgPath;

	/**
	 * キーワード
	 */
	private String keyword;

	/**
	 * @return traning_id トレーニングID
	 */
	public int getTraning_id() {
		return traning_id;
	}

	/**
	 * @param traning_id セットする traning_id トレーニングID
	 */
	public void setTraning_id(int traning_id) {
		this.traning_id = traning_id;
	}

	/**
	 * @return name トレーニング名
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name トレーニング名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return category トレーニング種別
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category セットする category トレーニング種別
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return goal トレーニングの目標
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * @param goal セットする goal トレーニングの目標
	 */
	public void setGoal(String goal) {
		this.goal = goal;
	}

	/**
	 * @return nop_max トレーニングの最大人数
	 */
	public int getNop_max() {
		return nop_max;
	}

	/**
	 * @param nop_max セットする nop_max トレーニングの最大人数
	 */
	public void setNop_max(int nop_max) {
		this.nop_max = nop_max;
	}

	/**
	 * @return nop_min トレーニングの最大人数
	 */
	public int getNop_min() {
		return nop_min;
	}

	/**
	 * @param nop_min セットする nop_min トレーニングの最小人数
	 */
	public void setNop_min(int nop_min) {
		this.nop_min = nop_min;
	}

	/**
	 * @return organize トレーニング範囲
	 */
	public String getOrganize() {
		return organize;
	}

	/**
	 * @param organize セットする organize トレーニング範囲
	 */
	public void setOrganize(String organize) {
		this.organize = organize;
	}

	/**
	 * @return traning_text トレーニング内容
	 */
	public String getTraning_text() {
		return traning_text;
	}

	/**
	 * @param traning_text セットする traning_text トレーニング内容
	 */
	public void setTraning_text(String traning_text) {
		this.traning_text = traning_text;
	}

	/**
	 * @return phenomenon 見るべきポイント
	 */
	public String getPhenomenon() {
		return phenomenon;
	}

	/**
	 * @param phenomenon セットする phenomenon 見るべきポイント
	 */
	public void setPhenomenon(String phenomenon) {
		this.phenomenon = phenomenon;
	}

	/**
	 * @return img トレーニング画像
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img セットする img トレーニング画像
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * @return keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword セットする keyword
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
