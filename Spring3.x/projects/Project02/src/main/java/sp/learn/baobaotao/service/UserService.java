package sp.learn.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sp.learn.baobaotao.dao.LoginLogDao;
import sp.learn.baobaotao.dao.UserDao;
import sp.learn.baobaotao.domain.LoginLog;
import sp.learn.baobaotao.domain.User;

/**
 * Created by Tondiyee on 2017/1/20.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String username,String password){
        return userDao.getMatchCount(username,password)>0;
    }
    public User findUserByUserName(String username){
        return userDao.findUserByUsername(username);
    }
    public void loginSuccess(User user){
        user.setCredits(5+user.getCredits());
        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());

        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }

}
