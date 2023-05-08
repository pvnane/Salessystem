package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@TableName("t_order")
public class Order extends Model<Order> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
      * 订单编号 
      */
    private String orderNo;

    /**
      * 总价 
      */
    private BigDecimal totalPrice;

    /**
      * 下单人id 
      */
    private Long userId;

    /**
      * 联系人 
      */
    private String linkUser;

    /**
      * 联系电话 
      */
    private String linkPhone;

    /**
      * 送货地址 
      */
    private String linkAddress;

    /**
      * 状态 
      */
    private String state;

    /**
      * 创建时间 
      */
    private String createTime;


    @TableField(exist = false)
    private String name;

    @TableField(exist = false)
    private String carts;

    @TableField(exist = false)
    private Integer type;

    @TableField(exist = false)
    private String alipayNo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    @TableField(exist = false)
    private Date payTime;


//    public void setPayTime(Date date) {
//    }
//
//    public void setAlipayNo(String alipayTradeNo) {
//    }
}