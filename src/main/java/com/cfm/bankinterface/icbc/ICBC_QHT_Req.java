package com.cfm.bankinterface.icbc;

import org.apache.commons.validator.ValidatorResults;

import com.cfm.bankinterface.RequestObj;

public class ICBC_QHT_Req extends RequestObj {

	/**
	 * 查询账号(必输)
	 */
	private String acctno;

	/**
	 * 起始日期(必输)
	 */
	private String beginDate;

	/**
	 * 截止日期(必输)
	 */
	private String endDate;

	/**
	 * 发生额下限(选输)
	 */
	private String minAmt;

	/**
	 * MaxAmt(选输)
	 */
	private String maxAmt;

	/**
	 * 行别(选输)
	 */
	private String bankCtype;

	/**
	 * 查询下页标识(选输)
	 */
	private String nextTag;

	/**
	 * 币种(选输)
	 */
	private String currno;

	/**
	 * 借据编号(选输)
	 */
	private String dueBillNo;

	/**
	 * 查询账号序号(选输)
	 */
	private String acctSeq;

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
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

	public String getMinAmt() {
		return minAmt;
	}

	public void setMinAmt(String minAmt) {
		this.minAmt = minAmt;
	}

	public String getMaxAmt() {
		return maxAmt;
	}

	public void setMaxAmt(String maxAmt) {
		this.maxAmt = maxAmt;
	}

	public String getBankCtype() {
		return bankCtype;
	}

	public void setBankCtype(String bankCtype) {
		this.bankCtype = bankCtype;
	}

	public String getNextTag() {
		return nextTag;
	}

	public void setNextTag(String nextTag) {
		this.nextTag = nextTag;
	}

	public String getCurrno() {
		return currno;
	}

	public void setCurrno(String currno) {
		this.currno = currno;
	}

	public String getDueBillNo() {
		return dueBillNo;
	}

	public void setDueBillNo(String dueBillNo) {
		this.dueBillNo = dueBillNo;
	}

	public String getAcctSeq() {
		return acctSeq;
	}

	public void setAcctSeq(String acctSeq) {
		this.acctSeq = acctSeq;
	}


	@Override
	public String post() {
		// TODO Auto-generated method stub
		return null;
	}

}
