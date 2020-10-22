package com.alinkeji.mfbot.impl;

import com.alinkeji.mfbot.EnableMfbot;
import com.alinkeji.mfbot.boot.Mfbot;
import com.alinkeji.mfbot.boot.MfbotProperties;
import com.alinkeji.mfbot.condition.ConditionOsName;
import com.google.common.collect.Lists;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import tech.mihoyo.CQHTTPKtCli;

/**
 * @Description
 * @ClassName MiraiBot
 * @Author linrol
 * @date 2020年10月22日 20:39 Copyright (c) 2020, linrol@77hub.com All Rights Reserved.
 */
@Component
@ConditionOsName({"Linux", "Windows", "Mac"})
@ConditionalOnProperty(value = "mf.bot.name", havingValue = "mirai")
public class MiraiBot implements Mfbot {

  @Override
  public void run(MfbotProperties mfbotProperties) {
    CQHTTPKtCli.INSTANCE.main(Lists.newArrayList());
  }
}
