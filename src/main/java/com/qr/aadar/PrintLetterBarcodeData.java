package com.qr.aadar;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author ramasamykasiviswanathan
 *
 */
public class PrintLetterBarcodeData {
	private String uid;
	private String name;
	private String gender;
	private String yob;
	private String co;
	private String house;
	private String street;
	private String loc;
	private String vtc;
	private String dist;
	private String state;
	private String pc;
	
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the yob
	 */
	public String getYob() {
		return yob;
	}
	/**
	 * @param yob the yob to set
	 */
	public void setYob(String yob) {
		this.yob = yob;
	}
	/**
	 * @return the co
	 */
	public String getCo() {
		return co;
	}
	/**
	 * @param co the co to set
	 */
	public void setCo(String co) {
		this.co = co;
	}
	/**
	 * @return the house
	 */
	public String getHouse() {
		return house;
	}
	/**
	 * @param house the house to set
	 */
	public void setHouse(String house) {
		this.house = house;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	/**
	 * @return the vtc
	 */
	public String getVtc() {
		return vtc;
	}
	/**
	 * @param vtc the vtc to set
	 */
	public void setVtc(String vtc) {
		this.vtc = vtc;
	}
	/**
	 * @return the dist
	 */
	public String getDist() {
		return dist;
	}
	/**
	 * @param dist the dist to set
	 */
	public void setDist(String dist) {
		this.dist = dist;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the pc
	 */
	public String getPc() {
		return pc;
	}
	/**
	 * @param pc the pc to set
	 */
	public void setPc(String pc) {
		this.pc = pc;
	}
	
	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this, new AadharToStringStyle()).toString();
	}
}
