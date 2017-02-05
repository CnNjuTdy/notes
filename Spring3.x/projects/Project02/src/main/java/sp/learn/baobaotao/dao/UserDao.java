package sp.learn.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import sp.learn.baobaotao.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Tondiyee on 2017/1/20.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String username,String password){
        String sql = "select count(*) from t_user where user_name=? and password=?";
        return jdbcTemplate.queryForObject(sql,new Object[]{username,password},Integer.class);
    }

    public User findUserByUsername(final String userName){
        final User user = new User();
        String sql = "select user_id,user_name,credits from t_user where user_name=?";
        jdbcTemplate.query(sql, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(rs.getString("user_name"));
                        user.setCredits(rs.getInt("credits"));
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user){
        String sql = "update t_user set last_visit=?,last_ip=?,credits=? where user_id=?";
        jdbcTemplate.update(sql,new Object[]{user.getLastVisit(),user.getLastIp(),user.getCredits(),user.getUserId()});
    }
}
