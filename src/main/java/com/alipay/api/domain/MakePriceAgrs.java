package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展变量
 *
 * @author auto create
 * @since 1.0, 2019-05-31 13:10:44
 */
public class MakePriceAgrs extends AlipayObject {

	private static final long serialVersionUID = 1597866428997253795L;

	/**
	 * 属性名称
	 */
	@ApiField("key")
	private String key;

	/**
	 * 属性值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}