package com.bit.classes.model;

import java.sql.Date;

public class ClassDto {
	private int num,delete;
	private String id,name,position,group,gangsa,period;
	private Date nalja;
	
	public ClassDto() {}

	public ClassDto(int num, int delete, String id, String name, String position, String group, String gangsa,
			String period, Date nalja) {
		super();
		this.num = num;
		this.delete = delete;
		id = id;
		name = name;
		position = position;
		this.group = group;
		this.gangsa = gangsa;
		this.period = period;
		this.nalja = nalja;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		position = position;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGangsa() {
		return gangsa;
	}

	public void setGangsa(String gangsa) {
		this.gangsa = gangsa;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + delete;
		result = prime * result + ((gangsa == null) ? 0 : gangsa.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((nalja == null) ? 0 : nalja.hashCode());
		result = prime * result + num;
		result = prime * result + ((period == null) ? 0 : period.hashCode());
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
		ClassDto other = (ClassDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (delete != other.delete)
			return false;
		if (gangsa == null) {
			if (other.gangsa != null)
				return false;
		} else if (!gangsa.equals(other.gangsa))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (nalja == null) {
			if (other.nalja != null)
				return false;
		} else if (!nalja.equals(other.nalja))
			return false;
		if (num != other.num)
			return false;
		if (period == null) {
			if (other.period != null)
				return false;
		} else if (!period.equals(other.period))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClassDto [num=" + num + ", delete=" + delete + ", id=" + id + ", name=" + name + ", position="
				+ position + ", group=" + group + ", gangsa=" + gangsa + ", period=" + period + ", nalja=" + nalja
				+ "]";
	}
	
	

}