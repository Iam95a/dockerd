package com.chen.docckerd.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author chenjinwei
 */
@Entity(name = "P_USER")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Column(name = "USER_ID")
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="NICKNAME")
    private String nickName;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="HEAD_URL")
    private String headUrl;
    @Column(name = "SEX")
    private Integer sex;
    @Column(name="PHONE_IMIE")
    private String phoneImie;

}
