package com.alinkeji.mfbot.condition;

import com.google.common.collect.Lists;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description
 * @ClassName ConditionOsNameMatch
 * @Author linrol
 * @date 2020年10月22日 21:02 Copyright (c) 2020, linrol@77hub.com All Rights Reserved.
 */
public class ConditionOsNameMatch implements Condition {

  private static Logger logger = LoggerFactory.getLogger(ConditionOsNameMatch.class);

  @Override
  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {

    String annotationName = ConditionOsName.class.getName();
    String[] supportOsNames = (String[]) Objects.requireNonNull(annotatedTypeMetadata
        .getAnnotationAttributes(annotationName)).get("value");
    //获取当前运行环境信息
    Environment environment = conditionContext.getEnvironment();
    //获取当前环境名称
    String osName = environment.getProperty("os.name");

    logger.info("Mfbot start on os.name: {}", osName);
    return Lists.newArrayList(supportOsNames).stream().anyMatch(m -> osName.contains(m));
  }
}
