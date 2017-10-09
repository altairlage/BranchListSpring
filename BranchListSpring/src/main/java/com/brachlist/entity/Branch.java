package com.brachlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	private int number;

	public Branch() {
	}

	public Branch(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
	
}
