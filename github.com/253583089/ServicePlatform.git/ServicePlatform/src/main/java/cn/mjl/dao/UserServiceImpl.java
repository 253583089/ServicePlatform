package cn.mjl.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mjl.pojo.UserT;
import cn.mjl.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserTMapper userDao;

	@Override
	public UserT getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}