package com.jd.discovery.channel.dal.client.domain;

/**
 * @classname: BaseIn
 * @description: 继承BaseModel，实现入参的一些公用特性
 * @author yanghuatao
 * @date Apr 28, 2013 4:56:30 PM
 */
public class PageIn {

	private static final long serialVersionUID = 5905943884899746354L;

	/* ----------------------------------------- constant ----------------------------------------- */
	/** 默认第一页 */
	public static final int DEFAULT_CURRENT_PAGE = 1;

	/** 默认每页显示记录数20 */
	public static final int DEFAULT_PAGE_SIZE = 20;

	/** 最大每页记录数2000 */
	public static final int PAGE_SIZE_MAX = 2000;

	/* ----------------------------------------- constant ----------------------------------------- */

	/** 当前页码 默认1 */
	private Integer pageNum = DEFAULT_CURRENT_PAGE;

	/** 每页显示记录数 默认20 */
	private Integer pageSize = DEFAULT_PAGE_SIZE;

	/**
	 * @return 当前页码默认1
	 */
	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		if (pageNum == null || pageNum <= 0) {
			this.pageNum = DEFAULT_CURRENT_PAGE;
		} else {
			this.pageNum = pageNum;
		}
	}

	/**
	 * @return 每页显示记录数默认20
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if (pageSize == null || pageSize <= 0) {
			this.pageSize = DEFAULT_PAGE_SIZE;
		} else if (pageSize > PAGE_SIZE_MAX) {
			this.pageSize = PAGE_SIZE_MAX;
		} else {
			this.pageSize = pageSize;
		}
	}

	/**
	 * @return 起始位
	 */
	public Integer getStartIndex() {
		return (pageNum - 1) * pageSize;
	}

	/**
	 * @return 结束位
	 */
	public Integer getEndIndex() {
		return pageNum * pageSize;
	}

}