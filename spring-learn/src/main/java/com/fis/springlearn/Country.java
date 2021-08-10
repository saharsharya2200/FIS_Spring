package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
		String name;
		String code;
		private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

		public Country() {
			LOGGER.debug("Inside Country Constructor");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		@Override
		public String toString() {
			return "Country [name=" + name + ", code=" + code + "]";
		}
		
		
		
		
}
