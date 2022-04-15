package org.x.fawn.user.service.impl;

import org.x.fawn.user.entity.User;
import org.x.fawn.user.mapper.UserMapper;
import org.x.fawn.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xpq
 * @since 2022-04-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}
