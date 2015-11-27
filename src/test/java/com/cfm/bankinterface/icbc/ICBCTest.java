package com.cfm.bankinterface.icbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class ICBCTest {

	@Before
	public void setUp() throws Exception {
	}
	
/*	@Test
	public void test_ICBC_QCBRequest() {
		ICBC_QCBRequest request = new ICBC_QCBRequest();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QCBRequest");
		ICBC_QCBRequest.AcctInfo[] infos = new ICBC_QCBRequest.AcctInfo[3];
		infos[0] =  request.new AcctInfo("222222","CNY");
		infos[1] =  request.new AcctInfo("333333","CNY");
		infos[2] =  request.new AcctInfo("333333","CNY");
		request.setParams(infos);
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml,"TotalNum"),infos.length+"");
		assertEquals(getValueFromXML(xml, "TransCode"), "QACCBAL");
		assertEquals(getValueFromXML(xml, "AccNo"), "222222");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");	
	}*/

	@Test
	public void test_ICBC_QHBRequest() {
		ICBC_QHBRequest request = new ICBC_QHBRequest();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QHBRequest");
		request.setAcctno("12345");
		request.setCurrno("CNY");
		//request.setBeginDate("20151127");
		//request.setEndDate("20151130");
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml, "TransCode"), "QHISBAL");
		assertEquals(getValueFromXML(xml, "AccNo"), "12345");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");
		//assertEquals(getValueFromXML(xml, "BeginDate"), "20151127");
		//assertEquals(getValueFromXML(xml, "EndDate"), "20151130");
		
	}
	
/*	@Test
	public void test_ICBC_QCTRequest(){
		ICBC_QCTRequest request = new ICBC_QCTRequest();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QCTRequest");
		request.setAcctno("12345");
		request.setCurrno("CNY");
		request.setAreaCode("1111");
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml, "TransCode"), "QPD");
		assertEquals(getValueFromXML(xml, "AccNo"), "12345");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");
		
	}
	
	
	@Test
	public void test_ICBC_QHTRequest(){
		ICBC_QHTRequest request = new ICBC_QHTRequest();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QHTRequest");
		request.setAcctno("12345");
		request.setCurrno("CNY");
		request.setBeginDate("20151127");
		request.setEndDate("20151130");
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml, "TransCode"), "QHISD");
		assertEquals(getValueFromXML(xml, "AccNo"), "12345");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");
		assertEquals(getValueFromXML(xml, "BeginDate"), "20151127");
		assertEquals(getValueFromXML(xml, "EndDate"), "20151130");
	}*/
	
	
	private String getValueFromXML(String source,String tagName){
		int start = source.indexOf("<"+tagName+">");
		int end=source.indexOf("</"+tagName+">");
		return source.substring(start+tagName.length()+2, end);
		
	}

}
