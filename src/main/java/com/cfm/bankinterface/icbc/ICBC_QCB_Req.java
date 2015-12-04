package com.cfm.bankinterface.icbc;

import com.cfm.bankinterface.RequestObj;
import com.cfm.bankinterface.exception.ValidateException;
import com.cfm.bankinterface.validatetool.DefaultValidatorGroup;
import com.cfm.bankinterface.validatetool.DefaultValidatorResource;

/**
 * 工商银行查询当日余额请求额对象
 * @author admin
 *
 */
public class ICBC_QCB_Req extends RequestObj {
	private AccountInfo[] params;
	private String totalNum;
	
	public class AccountInfo {

		private String acctno;

		private String currno;
		private String reqReserved;
		private String acctSqe;
		
		public AccountInfo(){
			
		}
		
		public AccountInfo(String acctno ,String currno){
			this.acctno=acctno;
			this.currno=currno;
		}

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

	
	public AccountInfo[] getParams() {
		return params;
	}

	public void setParams(AccountInfo[] params) {
		this.params = params;
		setTotalNum(params.length+"");
	}
	
	
	
	private void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String getTotalNum() {
		return this.params != null ? this.params.length+"":"0";
	}

	@Override
	public String getTransCode() {
		return "QACCBAL";
	}


}
