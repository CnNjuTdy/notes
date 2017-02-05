package sp.learn.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sp.learn.baobaotao.domain.LoginLog;

/**
 * Created by Tondiyee on 2017/1/20.
 */
@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sql="insert into t_login_log(user_id,ip,login_datetime) values(?,?,?)";
        jdbcTemplate.update(sql,new Object[]{loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()});
    }
}
