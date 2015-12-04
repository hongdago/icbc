package com.cfm.bankinterface.icbc;

import com.cfm.bankinterface.RequestObj;

/**
 * 工行查询当日交易请求对象
 * @author admin
 *
 */
public class ICBC_QCT_Req extends RequestObj {

	/**
	 * 查询账号(必输)
	 */
	private String acctno;

	/**
	 * 地区代码(选输)
	 */
	private String areaCode;

	/**
	 * 发生额下限(必输)
	 */
	private String minAmt = "0";

	/**
	 * 发生额上限 (必输)
	 */
	private String maxAmt = "0";

	/**
	 * 开始时间(选输)
	 */
	private String beginTime;

	/**
	 * 结束时间(选输)
	 */
	private String endTime;

	/**
	 * 查询下页标识(选输)
	 */
	private String nextTag;

	/**
	 * 请求包备用字段1(选输)
	 */
	private String reqReserved1;

	/**
	 * 请求包备用字段2(选输)
	 */
	private String reqReserved2;

	/**
	 * 币种(选输)
	 */
	private String currno;

	/**
	 * 查询账号序号(选输)
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
	public String getTransCode() {
		return "QPD";
	}

}
