package f_mvc_annotation.dao;

import f_mvc_annotation.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 功能
 *
 * @author caojianbang
 * @date 9.8.22 12:46 PM
 */
@Repository //spring创建爱你数据访问层对象
public class UsersMapperImpl implements UsersMapper {
    @Override
    public int insert(Users users) {
        System.out.println(users.getUname()+"用户添加成功");
        return 1;
    }
}
