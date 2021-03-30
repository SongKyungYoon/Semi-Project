package com.bi.gradelist.model;

public class GradelistDto {
	int num,java,database,framework,delete;
	String id,name,position,group,stuname;
	public GradelistDto() {}
	public GradelistDto(int num, int java, int database, int framework, int delete, String id, String name,
			String position, String group, String stuname) {
		super();
		this.num = num;
		this.java = java;
		this.database = database;
		this.framework = framework;
		this.delete = delete;
		id = id;
		name = name;
		position = position;
		this.group = group;
		this.stuname = stuname;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public int getFramework() {
		return framework;
	}
	public void setFramework(int framework) {
		this.framework = framework;
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
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + database;
		result = prime * result + delete;
		result = prime * result + framework;
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + java;
		result = prime * result + num;
		result = prime * result + ((stuname == null) ? 0 : stuname.hashCode());
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
		GradelistDto other = (GradelistDto) obj;
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
		if (database != other.database)
			return false;
		if (delete != other.delete)
			return false;
		if (framework != other.framework)
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (java != other.java)
			return false;
		if (num != other.num)
			return false;
		if (stuname == null) {
			if (other.stuname != null)
				return false;
		} else if (!stuname.equals(other.stuname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GradelistDto [num=" + num + ", java=" + java + ", database=" + database + ", framework=" + framework
				+ ", delete=" + delete + ", id=" + id + ", name=" + name + ", position=" + position + ", group=" + group
				+ ", stuname=" + stuname + "]";
	}
	
}