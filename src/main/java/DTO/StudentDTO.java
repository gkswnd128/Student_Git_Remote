package DTO;

import java.sql.Date;
public class StudentDTO {

		private int rank;
		private int sid;
		private String name;
		private int kor;
		private int eng;
		private int math;
		private Date exam_date;
		
		public StudentDTO() {
			super();
		}
		public StudentDTO(int rank, int sid, String name, int kor, int eng, int math, Date exam_date) {
			this.rank = rank;
			this.sid = sid;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.exam_date = exam_date;
		}
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getKor() {
			return kor;
		}
		public void setKor(int kor) {
			this.kor = kor;
		}
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			this.eng = eng;
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
			this.math = math;
		}
		public Date getExam_date() {
			return exam_date;
		}
		public void setExam_date(Date exam_date) {
			this.exam_date = exam_date;
		}
		
		
		
		
		
		
		
	}

