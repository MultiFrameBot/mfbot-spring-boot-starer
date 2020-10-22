package com.alinkeji.mfbot.boot;

import com.alinkeji.mfbot.EnableMfbot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @ClassName AutoConfiguration
 * @Author linrol
 * @date 2020年10月22日 13:44 Copyright (c) 2020, linrol@77hub.com All Rights Reserved.
 */
@Configuration
@EnableConfigurationProperties({MfbotProperties.class})
@ConditionalOnBean(annotation = EnableMfbot.class)
public class AutoConfiguration implements CommandLineRunner {

  private static Logger logger = LoggerFactory.getLogger(AutoConfiguration.class);

  @Autowired
  private MfbotProperties mfbotProperties;

  @Autowired
  private Mfbot mfbot;


  @Override
  public void run(String... args) {
    logger.info("初始化机器人: {}", mfbotProperties.getName());
    mfbot.run(mfbotProperties);
  }
}
