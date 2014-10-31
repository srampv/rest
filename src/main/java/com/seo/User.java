package com.seo;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

@XmlRootElement
@XmlType(propOrder={"firstName","lastName","list"})
public class User extends Module implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private List<Address> list;
	public User(){
		
	}
	/**
	 * @return the firstName
	 */
	@XmlElement
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	@XmlElement
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Version version() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setupModule(SetupContext context) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @return the list
	 */
	@XmlElement
	public List<Address> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Address> list) {
		this.list = list;
	}
	
	
	

}
