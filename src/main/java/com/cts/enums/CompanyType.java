package com.cts.enums;

import org.apache.commons.lang3.StringUtils;

public enum CompanyType implements Enums {

	PRODUCER(1, "供票单位"), CONSUMER(2, "用票单位");

	private int dbConstant;
	private String text;

	private CompanyType(int dbConstant, String text) {
		this.dbConstant = dbConstant;
		this.text = text;
	}

	@Override
	public int getDbConstant() {
		return dbConstant;
	}

	@Override
	public String getText() {
		return text;
	}

	public static CompanyType fromDbConstant(int dbConstant) {
		for (CompanyType c : values()) {
			if (c.getDbConstant() == dbConstant) {
				return c;
			}
		}
		return null;
	}

	public static CompanyType fromText(String text) {
		for (CompanyType c : values()) {
			if (StringUtils.equals(c.getText(), text)) {
				return c;
			}
		}
		return null;
	}

}
