package com.baomidou.mybatisplus.samples.enums.entity;

import com.baomidou.mybatisplus.samples.enums.enums.AgeEnum;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户实体对应表 user
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 */
@Data
@Accessors(chain = true)
public class User extends BaseEntity {
    private String name;
    private AgeEnum age;
    private String email;

}
