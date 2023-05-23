package org.tnsif.hierachialinteritance;

public class FireCone extends Android {
	
	private String versionName;
	private String modelName;
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public FireCone(String versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "FireCone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOnwerName()=" + getOnwerName() + "]";
	}
	
}
