package com.bit.classes.model;

import java.sql.Date;

public class ClassDto {
	private int num,delete;
	private String ID,NAME,POSITION,group,gangsa,period;
	private Date nalja;
	
	public ClassDto() {}

	public ClassDto(int num, int delete, String iD, String nAME, String pOSITION, String group, String gangsa,
			String period, Date nalja) {
		super();
		this.num = num;
		this.delete = delete;
		ID = iD;
		NAME = nAME;
		POSITION = pOSITION;
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
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((NAME == null) ? 0 : NAME.hashCode());
		result = prime * result + ((POSITION == null) ? 0 : POSITION.hashCode());
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
		return "ClassDto [num=" + num + ", delete=" + delete + ", ID=" + ID + ", NAME=" + NAME + ", POSITION="
				+ POSITION + ", group=" + group + ", gangsa=" + gangsa + ", period=" + period + ", nalja=" + nalja
				+ "]";
	}
	
	

}
