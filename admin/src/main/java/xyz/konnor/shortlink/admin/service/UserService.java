package xyz.konnor.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.konnor.shortlink.admin.dao.entity.UserDO;
import xyz.konnor.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 返回用户实体
     */
    UserRespDTO getUserByUserName(String username);
}
