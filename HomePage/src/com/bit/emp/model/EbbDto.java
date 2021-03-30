package com.bit.emp.model;

import java.sql.Date;

public class EbbDto {
	private String id,name,position,coname,content,deadline,coposition;
	private Date nalja;
	private int num,count,delete;
	EbbDto(){}
	public EbbDto(String id, String name, String position, String coname, String content, String deadline,
			String coposition, Date nalja, int num, int count, int delete) {
		super();
		id = id;
		name = name;
		position = position;
		this.coname = coname;
		this.content = content;
		this.deadline = deadline;
		this.coposition = coposition;
		this.nalja = nalja;
		this.num = num;
		this.count = count;
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
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getCoposition() {
		return coposition;
	}
	public void setCoposition(String coposition) {
		this.coposition = coposition;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getDelete() {
		return delete;
	}
	public void setDelete(int delete) {
		this.delete = delete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((coname == null) ? 0 : coname.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((coposition == null) ? 0 : coposition.hashCode());
		result = prime * result + count;
		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
		result = prime * result + delete;
		result = prime * result + ((nalja == null) ? 0 : nalja.hashCode());
		result = prime * result + num;
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
		EbbDto other = (EbbDto) obj;
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
		if (coname == null) {
			if (other.coname != null)
				return false;
		} else if (!coname.equals(other.coname))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (coposition == null) {
			if (other.coposition != null)
				return false;
		} else if (!coposition.equals(other.coposition))
			return false;
		if (count != other.count)
			return false;
		if (deadline == null) {
			if (other.deadline != null)
				return false;
		} else if (!deadline.equals(other.deadline))
			return false;
		if (delete != other.delete)
			return false;
		if (nalja == null) {
			if (other.nalja != null)
				return false;
		} else if (!nalja.equals(other.nalja))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmpDto [id=" + id + ", name=" + name + ", position=" + position + ", coname=" + coname + ", content="
				+ content + ", deadline=" + deadline + ", coposition=" + coposition + ", nalja=" + nalja + ", num="
				+ num + ", count=" + count + ", delete=" + delete + "]";
	}
	
}