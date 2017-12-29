package dao;

import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.HumanInfo;
import entity.UserInfo;
import util.DBAccess;

public class HumanDao {

	//List<HumanInfo>
	public List<HumanInfo> list() {
		return list(0, Short.MAX_VALUE);
	}
	public List<HumanInfo> list(int start,int count){
		List<HumanInfo> humans = new ArrayList<HumanInfo>();
		String sql = "select * from human order by carid desc limit ?,?";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, start);
			ps.setInt(2, count);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				HumanInfo human = new HumanInfo();
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				int beauty = rs.getInt(4);

				human.setHumanId(id);
				human.setHumanName(name);
				human.setHumanAge(age);
				human.setHumanBeauty(beauty);
				humans.add(human);
			}
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return humans;
	}
	
	//get a certain value though human name or human id 查(姓名/id) ->SearchHumanServlet
	public List<HumanInfo> query(String value){
		List<HumanInfo> humans = new ArrayList();		
		String sql = "select * from human where name = ? or id= ? ";
		try(Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) 
		{	
			ps.setString(1, value);
			ps.setString(2, value);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				HumanInfo human = new HumanInfo();
				human.setHumanId(rs.getInt(1));
				human.setHumanName(rs.getString(2));
				human.setHumanAge(rs.getInt(3));
				human.setHumanBeauty(rs.getInt(4));
				humans.add(human);
			}
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return humans;
	}
	
	//get all human value form MySQL 全部查找 -> ListHumanServlet
	public int getTotal() {
		int total = 0;
		String sql = "select count(*) from human";
		try(Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) 
		{
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				total = rs.getInt(1);
			}
			ps.close();
			conn.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
//	//get a certain value though a certain name 查（根据姓名）
//	public HumanInfo get(String name) {
//		HumanInfo human = new HumanInfo();
//		String sql = "select * from human where name = ?";
//		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
//
//			ps.setString(1, name);
//			ResultSet rs = ps.executeQuery();
//			
//			while (rs.next()) {
//	
//				int humanId = rs.getInt(1);
//				String humanName = rs.getString(2);
//				int humanAge = rs.getInt(3);
//				int humanBeauty = rs.getInt(4);
//				String imgUrl = rs.getString(5);
//
//				human.setHumanName(humanName);
//				human.setHumanAge(humanAge);
//				human.setHumanBeauty(humanBeauty);
//				human.setImgUrl(imgUrl);
//			}
//			ps.close();
//			conn.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return human;
//	}
	
	//register 注册User -> Register
	public void register(UserInfo user) {
		String sql = "insert into user values(null,?,?)";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, user.getUserEmail());
			ps.setString(2, user.getUserPassword());
			ps.execute();

			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//add a human value 增 -> AddHumanServlet
	public void add(HumanInfo human) {
		String sql = "insert into human values(null,?,?,?,?)";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, human.getHumanName());
			ps.setInt(2, human.gethumanAge());
			ps.setInt(3, human.getHumanBeauty());
			ps.setString(4, human.getImgUrl());
			ps.execute();

			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//update a human value 改 -> UpdateCarServlet
	public void update(HumanInfo human) {
		String sql = "update human set name = ?, age = ?, beauty = ? where id = ? ";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) 
		{
			ps.setString(1, human.getHumanName());
			ps.setInt(2, human.gethumanAge());
			ps.setInt(3, human.getHumanBeauty());
			ps.setInt(4, human.getHumanId());

			ps.execute();

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
//	public void update(String name,int age,int beauty) {
//		String sql = "update human set age = ?, beauty = ?where name = ?";
//		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
//			ps.setInt(1, age);
//			ps.setInt(2, beauty);
//			ps.setString(3, name);
//			
//			ps.execute();
//			ps.close();
//			conn.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	//delete a human value 删 -> DelectHumanServlet
	public void delect(int id){
		String sql = "delect from human where name = ?";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, id);
			
			ps.execute();
			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//get a certain Img though a certain human name 查URL
	public String getImgUrl(String name) {
		String imgPath = "";
		String sql = "select imgurl from human where name = ?";
		try (Connection conn = new DBAccess().getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				imgPath = rs.getString(5);
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return imgPath;
	}
}
