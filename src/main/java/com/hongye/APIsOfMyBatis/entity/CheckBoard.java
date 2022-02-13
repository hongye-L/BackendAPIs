package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (ClockIn)实体类
 *
 * @author makejava
 * @since 2022-01-29 14:13:48
 */
@Data
public class CheckBoard implements Serializable {
    private static final long serialVersionUID = 416452489643557308L;
    
    private Integer userid;
    
    private Date time;
}