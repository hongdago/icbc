package com.cfm.bankinterface.icbc;

import org.apache.commons.validator.ValidatorResults;

import com.cfm.bankinterface.RequestObj;

public class ICBC_QCTRequest extends RequestObj {

	/**
	 * ��ѯ�˺�(����)
	 */
	private String acctno;

	/**
	 * ��������(ѡ��)
	 */
	private String areaCode;

	/**
	 * ����������(����)
	 */
	private String minAmt = "0";

	/**
	 * ���������� (����)
	 */
	private String maxAmt = "0";

	/**
	 * ��ʼʱ��(ѡ��)
	 */
	private String beginTime;

	/**
	 * ����ʱ��(ѡ��)
	 */
	private String endTime;

	/**
	 * ��ѯ��ҳ��ʶ(ѡ��)
	 */
	private String nextTag;

	/**
	 * ����������ֶ�1(ѡ��)
	 */
	private String reqReserved1;

	/**
	 * ����������ֶ�2(ѡ��)
	 */
	private String reqReserved2;

	/**
	 * ����(ѡ��)
	 */
	private String currno;

	/**
	 * ��ѯ�˺����(ѡ��)
	 */
	private String acctSqe;

	public String getAcctno() {
		return acctno;
	}

	public void setAcctno(String acctno) {
		this.acctno = acctno;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
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

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNextTag() {
		return nextTag;
	}

	public void setNextTag(String nextTag) {
		this.nextTag = nextTag;
	}

	public String getReqReserved1() {
		return reqReserved1;
	}

	public void setReqReserved1(String reqReserved1) {
		this.reqReserved1 = reqReserved1;
	}

	public String getReqReserved2() {
		return reqReserved2;
	}

	public void setReqReserved2(String reqReserved2) {
		this.reqReserved2 = reqReserved2;
	}

	public String getCurrno() {
		return currno;
	}

	public void setCurrno(String currno) {
		this.currno = currno;
	}

	public String getAcctSqe() {
		return acctSqe;
	}

	public void setAcctSqe(String acctSqe) {
		this.acctSqe = acctSqe;
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
