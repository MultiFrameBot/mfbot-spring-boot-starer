package com.alinkeji.mfbot.impl;

import com.alinkeji.mfbot.EnableMfbot;
import com.alinkeji.mfbot.boot.Mfbot;
import com.alinkeji.mfbot.boot.MfbotProperties;
import com.alinkeji.mfbot.condition.ConditionOsName;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName MiraiGoBot
 * @Author linrol
 * @date 2020年10月22日 20:41 Copyright (c) 2020, linrol@77hub.com All Rights Reserved.
 */
@Component
@ConditionOsName({"Linux", "Mac"})
@ConditionalOnProperty(value = "mf.bot.name", havingValue = "miraiGo")
public class MiraiGoBot implements Mfbot {

  @Override
  public void run(MfbotProperties mfbotProperties) {

  }
}
