package com.mybatis.crypto.entity;

import io.github.whitedg.mybatis.crypto.EncryptedField;
import lombok.Data;

/**
 * User
 *
 * @author gaoxinzhong
 * @date 2022/2/14 14:09
 **/
@Data
public class User {

    private Long id;

    @EncryptedField
    private String name;

    private Integer age;

    private String email;
}
