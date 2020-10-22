package com.alinkeji.mfbot.boot;

import com.alinkeji.mfbot.EnableMfbot;

@EnableMfbot
public interface Mfbot {

  void run(MfbotProperties mfbotProperties);

}
