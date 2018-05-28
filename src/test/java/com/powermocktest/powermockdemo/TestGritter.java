package com.powermocktest.powermockdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.anyString;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Logger.class)
public class TestGritter {

  @Test
  public void test() throws Exception {
    PowerMockito.spy(Logger.class);
    PowerMockito.doNothing().when(Logger.class, "info", anyString());
    Gritter gritter = new Gritter();
    gritter.SayHello();
  }

}
