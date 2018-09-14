package com.plv.weather.utils;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
* <p>Title: XmlBuilder</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2018</p>
* @author yaohp 837965182@qq.com
* @date 2018年9月14日 上午9:26:19
* @version 1.0  
*@instructions:
*/
public class XmlBuilder {
	
	/**
	 * <p>Title: xmlStrToObject</p>  
	 * <p>Description: 将XML转为指定的POJO</p>  
	 * @author yaohp  
	 * @date 2018年9月14日
	 * @param clazz
	 * @param xmlStr
	 * @return
	 * @throws Exception
	 */
	public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception{
		Object xmlObject = null;
		Reader reader = null;
		JAXBContext context = JAXBContext.newInstance(clazz);
		//XML转为对象的接口
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		reader = new StringReader(xmlStr);
		xmlObject = unmarshaller.unmarshal(reader);
		
		if(null != reader) {
			reader.close();
		}
		
		return xmlObject;
	}
}

