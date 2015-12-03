package com.cfm.bankinterface.icbc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.cfm.bankinterface.icbc.ICBC_QCB_Req.AccountInfo;

public class ICBCTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test_ICBC_QCBRequest() throws Exception {
		ICBC_QCB_Req request = new ICBC_QCB_Req();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QCB_Req");
		AccountInfo[] infos = new AccountInfo[3];
		infos[0] =  request.new AccountInfo("222222","CNY");
		infos[1] =  request.new AccountInfo("444444","CNY");
		infos[2] =  request.new AccountInfo("333333","CNY");
		request.setParams(infos);
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml,"TotalNum"),infos.length+"");
		assertEquals(getValueFromXML(xml, "TransCode"), "QACCBAL");
		assertEquals(getValueFromXML(xml, "AccNo"), "222222");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");	
		
	}

	@Test
	public void test_ICBC_QHBRequest() throws Exception {
		ICBC_QHB_Req request = new ICBC_QHB_Req();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QHB_Req");
		request.setAcctno("12345");
		request.setCurrno("CNY");
		request.setBeginDate("20151127");
		request.setEndDate("20151126");
		String xml = request.gerneateXML();
		System.out.println(xml);
		assertNotNull(xml);
		assertEquals(getValueFromXML(xml, "TransCode"), "QHISBAL");
		assertEquals(getValueFromXML(xml, "AccNo"), "12345");
		assertEquals(getValueFromXML(xml, "CurrType"), "CNY");
		assertEquals(getValueFromXML(xml, "BeginDate"), "20151127");
		assertEquals(getValueFromXML(xml, "EndDate"), "20151128");
		
	}

	
	@Test
	public void test_ICBC_QCTRequest() throws Exception{
		ICBC_QCT_Req request = new ICBC_QCT_Req();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QCT_Req");
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
	public void test_ICBC_QHTRequest() throws Exception{
		ICBC_QHT_Req request = new ICBC_QHT_Req();
		assertEquals(request.getBankType(),"ICBC");
		assertEquals(request.getOperType(), "QHT_Req");
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
	}
	
	
	private String getValueFromXML(String source,String tagName){
		int start = source.indexOf("<"+tagName+">");
		int end=source.indexOf("</"+tagName+">");
		return source.substring(start+tagName.length()+2, end);
		
	}

}
