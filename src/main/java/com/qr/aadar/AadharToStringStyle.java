package com.qr.aadar;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author ramasamykasiviswanathan
 *
 */
public class AadharToStringStyle extends ToStringStyle
{
	private static final long serialVersionUID = -34481923112317656L;

	public AadharToStringStyle() {
		super();
		this.setUseIdentityHashCode(false);
		this.setFieldNameValueSeparator("=\"");
		this.setUseFieldNames(true);
		this.setUseClassName(false);
		this.setContentStart("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+System.getProperty("line.separator")+"<"+ClassUtils.getShortClassName(PrintLetterBarcodeData.class)+" ");
		this.setContentEnd("\"/>");
		
        this.setFieldSeparator("\" ");
        this.setNullText("null");
	}
}
