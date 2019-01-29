package com.hope.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.List;

/**druidProperties类
 * @program:hope-plus
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @微信公众号:低调小熊猫
 * @create:2018-10-17 11:35
 **/
@Configuration
@ConfigurationProperties(prefix = "hope.druid")
@EnableConfigurationProperties(DruidProperties.class)
@Data
@EqualsAndHashCode(callSuper = false)
@Order(-1)
public class DruidProperties {
    private String username;
    private String password;
    private String servletPath="/druid/*";
    private Boolean resetEnable=false;
    private List<String> allowIps;
    private List<String> denyIps;
}