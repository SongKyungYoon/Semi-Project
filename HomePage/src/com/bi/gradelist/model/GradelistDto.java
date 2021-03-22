package com.bi.gradelist.model;

public class GradelistDto {
	int num,java,database,framework,delete;
	String ID,NAME,POSITION,group,stuname;
	public GradelistDto() {}
	public GradelistDto(int num, int java, int database, int framework, int delete, String iD, String nAME,
			String pOSITION, String group, String stuname) {
		super();
		this.num = num;
		this.java = java;
		this.database = database;
		this.framework = framework;
		this.delete = delete;
		ID = iD;
		NAME = nAME;
		POSITION = pOSITION;
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
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getPOSITION() {
		return POSITION;
	}
	public void setPOSITION(String pOSITION) {
		POSITION = pOSITION;
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
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((NAME == null) ? 0 : NAME.hashCode());
		result = prime * result + ((POSITION == null) ? 0 : POSITION.hashCode());
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
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (NAME == null) {
			if (other.NAME != null)
				return false;
		} else if (!NAME.equals(other.NAME))
			return false;
		if (POSITION == null) {
			if (other.POSITION != null)
				return false;
		} else if (!POSITION.equals(other.POSITION))
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
				+ ", delete=" + delete + ", ID=" + ID + ", NAME=" + NAME + ", POSITION=" + POSITION + ", group=" + group
				+ ", stuname=" + stuname + "]";
	}
	
}
