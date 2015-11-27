package com.cfm.bankinterface.icbc;

import org.apache.commons.validator.ValidatorResults;

import com.cfm.bankinterface.RequestObj;

public class ICBC_QHTRequest extends RequestObj {

	/**
	 * ��ѯ�˺�(����)
	 */
	private String acctno;

	/**
	 * ��ʼ����(����)
	 */
	private String beginDate;

	/**
	 * ��ֹ����(����)
	 */
	private String endDate;

	/**
	 * ����������(ѡ��)
	 */
	private String minAmt;

	/**
	 * MaxAmt(ѡ��)
	 */
	private String maxAmt;

	/**
	 * �б�(ѡ��)
	 */
	private String bankCtype;

	/**
	 * ��ѯ��ҳ��ʶ(ѡ��)
	 */
	private String nextTag;

	/**
	 * ����(ѡ��)
	 */
	private String currno;

	/**
	 * ��ݱ��(ѡ��)
	 */
	private String dueBillNo;

	/**
	 * ��ѯ�˺����(ѡ��)
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
	protected ValidatorResults validate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String post() {
		// TODO Auto-generated method stub
		return null;
	}

}
