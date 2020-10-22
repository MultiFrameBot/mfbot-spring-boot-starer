package com.alinkeji.mfbot.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mf.bot")
public class MfbotProperties {

  /**
   * 机器人框架名称
   */
  private String name = "mirai";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
