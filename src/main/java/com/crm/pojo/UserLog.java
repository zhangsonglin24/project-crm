package com.crm.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/18.
 */
@Data
@Entity
@Table
public class UserLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logintime;
    private String loginip;
    private Integer userid;




}
