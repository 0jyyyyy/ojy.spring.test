package ojy.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	/*
	 * ListŸ��
	 * private List<String> addressList;

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}*/
	/*
	 * MapŸ��
	 * private Map<String, String> addressList;

	public Map<String, String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}*/
	/*
	 * Properties Ÿ��
	 * private Properties addressList;

	public Properties getAddressList() {
		return addressList;
	}

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}*/
	public Set<String> addressList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}
	
}
