package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule
{
	@Bean
	public IRule myRule()
	{
		return new RandomRule_ZY();// 自定义负载规则:每台机器轮询5次
	}
}
