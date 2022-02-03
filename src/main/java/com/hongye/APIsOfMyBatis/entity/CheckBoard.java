package com.hongye.APIsOfMyBatis.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.io.Serializable;

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