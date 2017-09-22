package com.javasampleapproach.mysql.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countynames")
public class County implements Serializable {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id=100;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "parent_id")
    private String parent_id;
	
	@Column(name = "type")
    private String type;
	
	protected County() {
		
	}
  public County(String parent_id, String name, String type) {
		// TODO Auto-generated constructor stub
	  this.parent_id = parent_id;
	  this.name = name;
	  this.type = type;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return String.format("County[id=%d, name='%s', type='%s']", id, name, type);
	}
}
