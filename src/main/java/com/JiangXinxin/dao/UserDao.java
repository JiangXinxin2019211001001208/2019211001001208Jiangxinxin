package com.JiangXinxin.dao;

import com.JiangXinxin.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{
    @Override
    public boolean saveUser(Connection con, Object o) throws SQLException {
        return false;
    }

    @Override
    public int deleteUser(Connection con, Object o) throws SQLException {
        return 0;
    }

    @Override
    public int updateUser(Connection con, Object o) throws SQLException {
        return 0;
    }

    @Override
    public boolean saveUser(Connection con, User user) throws SQLException {
        return false;
    }

    @Override
    public int deleteUser(Connection con, User user) throws SQLException {
        return 0;
    }

    @Override
    public int updateUser(Connection con, User user) throws SQLException {
        return 0;
    }

    @Override
    public User findById(Connection con, Integer id) throws SQLException {
        return null;
    }

    @Override
    public User findByUsernamePassword(Connection con, String username, String password) throws SQLException {
        String sql="select id,username,password,email,gender,birthdate from usertable where username=? and password=?";
        PreparedStatement st=con.prepareStatement(sql);
        ResultSet rs= st.executeQuery();
        User user=null;
        if(rs.next()){
           user=new User();
           user.setId(rs.getInt("id"));
           user.setUsername(rs.getString("username"));
           user.setPassword(rs.getString("password"));
           user.setEmail(rs.getString("email"));
           user.setGender(rs.getString("gender"));
           user.setBirthdate(rs.getDate("birthdate"));
        };
        return null;
    }

    @Override
    public List findByUsername(Connection con, String username) throws SQLException {
        return null;
    }

    @Override
    public List findByPassword(Connection con, String password) throws SQLException {
        return null;
    }

    @Override
    public List findByEmail(Connection con, String email) throws SQLException {
        return null;
    }

    @Override
    public List findByGender(Connection con, String gender) throws SQLException {
        return null;
    }

    @Override
    public List findByBirthdate(Connection con, Date birthDate) throws SQLException {
        return null;
    }

    @Override
    public List findAllUser(Connection con) throws SQLException {
        return null;
    }
}
