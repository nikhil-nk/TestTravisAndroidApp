package com.example.siddharth.testtravisandroidapp;

import com.example.siddharth.testtravisandroidapp.Utils.TextUtils.TextUtilsClass;
import org.junit.Test;

import static org.junit.Assert.*;
import com.example.siddharth.testtravisandroidapp.Utils.*;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TextUtilsClassTest {
  @Test
  public void justARandomUnitTest() throws Exception {
    String a = TextUtilsClass.gettingText();
    assertEquals(a, "This is some random text!");
  }
}