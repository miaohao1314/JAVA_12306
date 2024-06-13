package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 使用以下注解可以省略get和set方法,可以用Data替代这三个
 * @Getter
 * @Setter
 *@ToString
 *
 * 使用@Builder设计模式
 *
 * 无参数构造函数
 * 有参数构造函数
 * @NoArgsConstructor
 * @AllArgsConstructor
 *
 * 定义日志实例
 * @Slf4j
 */

//@Getter
//@Setter
//@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class SysUser {
    private Integer id;

    private String username;

    private String telephone;

    private String mail;

    private String password;

    private Integer deptId;

    private Integer status;

    private String remark;

    private String operator;

    private Date operateTime;

    private String operateIp;

//    使用@Builder设计模式
//public static void main(String[] args) {
//    //具体赋值通过builder去构造一个实例出来
//    SysUser.builder().deptId().id().build();
//}


//    定义日志实例@Slf4j
//public static void main(String[] args) {
//    log.info("");
//}


}