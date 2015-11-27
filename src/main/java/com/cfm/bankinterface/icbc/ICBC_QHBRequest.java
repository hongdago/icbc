package com.cfm.bankinterface.icbc;

import org.apache.commons.validator.ValidatorResults;

import com.cfm.bankinterface.RequestObj;

public class ICBC_QHBRequest extends RequestObj {

	/**
	 * 账户号
	 */
	private String acctno;

	/**
	 * 币种
	 */
	private String currno;

	/**
	 * 查询开始时间
	 */
	private String beginDate;

	/**
	 * 查询结束日期
	 */
	private String endDate;

	/**
	 * 账号序号(选输项)
	 */
	private String acctSqe;

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getCurrno() {
		return currno;
	}

	public void setCurrno(String currno) {
		this.currno = currno;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAcctSqe() {
		return acctSqe;
	}

	public void setAcctSqe(String acctSqe) {
		this.acctSqe = acctSqe;
	}

	@Override
	protected ValidatorResults validate() {
		return null;
	}

	@Override
	public String post() {
		return null;
	}

}
