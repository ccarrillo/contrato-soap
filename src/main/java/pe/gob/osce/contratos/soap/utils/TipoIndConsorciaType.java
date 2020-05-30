package pe.gob.osce.contratos.soap.utils;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TipoIndConsorciaType {

	SI("1", "Si"),
	NO("0", "No");

	private String key;
	private String value;
	private static final Map<String, TipoIndConsorciaType> lookup = new HashMap<String, TipoIndConsorciaType>();

	private TipoIndConsorciaType(String key, String value) {
		this.key = key;
		this.value = value;
	}

	static {
		for (TipoIndConsorciaType s : EnumSet.allOf(TipoIndConsorciaType.class)) {
			lookup.put(s.getKey(), s);
		}
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public static TipoIndConsorciaType get(String key) {
		TipoIndConsorciaType temp = lookup.get(key);
		return temp;
	}
}
