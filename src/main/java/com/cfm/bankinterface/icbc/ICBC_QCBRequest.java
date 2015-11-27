package com.cfm.bankinterface.icbc;

import org.apache.commons.validator.ValidatorResults;

import com.cfm.bankinterface.RequestObj;

public class ICBC_QCBRequest extends RequestObj {
	private AcctInfo[] params;
	private String totalNum;

	public class AcctInfo {
		public AcctInfo(String acctno, String currno) {
			this.acctno = acctno;
			this.currno = currno;
			this.reqReserved = "";
			this.acctSqe = "";
		}

		private String acctno;
		private String currno;
		private String reqReserved;
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

		public String getReqReserved() {
			return reqReserved;
		}

		public void setReqReserved(String reqReserved) {
			this.reqReserved = reqReserved;
		}

		public String getAcctSqe() {
			return acctSqe;
		}

		public void setAcctSqe(String acctSqe) {
			this.acctSqe = acctSqe;
		}
	}
	
	
	
	public AcctInfo[] getParams() {
		return params;
	}

	public void setParams(AcctInfo[] params) {
		this.params = params;
		this.totalNum= params.length+"";
	}
	
	
	
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String getTotalNum() {
		return this.params != null ? this.params.length+"":"0";
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
