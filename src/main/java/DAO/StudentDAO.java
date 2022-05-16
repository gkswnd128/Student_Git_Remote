package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

import DTO.StudentDTO;

public class StudentDAO {

	private static StudentDAO  instance = null;

	public synchronized static StudentDAO  getInstance() {
		
		if(instance == null) {
			instance = new StudentDAO ();
		
		}
		return instance;
	}
	
	private Connection getConnection() throws Exception{
		Context ctx = new InitialContext();
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/orcl");
		return ds.getConnection();
	}

	public List<StudentDTO> selectAll() throws Exception{
		String sql = "select rank() over(order by kor +eng + math desc) rank, sid, name, kor, eng, math from student";
		try(Connection con = this.getConnection();
				PreparedStatement pstat = con.prepareStatement(sql);
				ResultSet rs = pstat.executeQuery();){
			
				List<StudentDTO> list = new ArrayList<>();
				while(rs.next()) {
					StudentDTO dto = new StudentDTO();
					dto.setRank(rs.getInt("rank"));
					dto.setSid(rs.getInt("sid"));
					dto.setName(rs.getString("name"));
					dto.setKor(rs.getInt("kor"));
					dto.setEng(rs.getInt("eng"));
					dto.setMath(rs.getInt("math"));

					list.add(dto);
				}
				return list;
			}

		}
	
	
	
	
	
	
	}

