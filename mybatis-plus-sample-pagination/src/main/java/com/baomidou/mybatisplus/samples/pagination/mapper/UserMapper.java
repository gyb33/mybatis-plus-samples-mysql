package com.baomidou.mybatisplus.samples.pagination.mapper;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.samples.pagination.entity.User;
import com.baomidou.mybatisplus.samples.pagination.model.MyPage;

/**
 * @author miemie
 * @since 2018-08-10
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 3.x 的 page 可以进行取值,多个入参记得加上注解
     * 自定义 page 类必须放在入参第一位
     * 返回值可以用 IPage<T> 接收 也可以使用入参的 MyPage<T> 接收
     * todo 目前使用注解会报错,写在 xml 里就没事
     *
     * @param myPage 自定义 page
     * @return 分页数据
     */
    IPage<User> mySelectPage(@Param("pg") MyPage<User> myPage);

//    @Select("select * from user where age = #{pg.selectInt} and name = #{pg.selectStr}")
//    @ResultType(User.class)
//    MyPage<User> atSelectPage(@Param("pg") MyPage<User> myPage);
}
