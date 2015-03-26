/* Copyright (c) 2014 Partnet, Inc. Confidential and Proprietary. */

package junit.sample.test;

import javax.inject.Inject;

import junit.sample.step.SearchSteps;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.partnet.junit.SeAuto;
import com.partnet.junit.annotations.browser.Chrome;
import com.partnet.junit.annotations.browser.Firefox;
import com.partnet.junit.annotations.browser.HTMLUnit;
import com.partnet.junit.annotations.browser.PhantomJs;

/**
 * @author <a href="mailto:bbarker@part.net">bbarker</a>
 */
@RunWith(SeAuto.class)
public class BingTest
{

  @Inject
  private SearchSteps searchSteps;
  
  @Test
  @Firefox
  public void searchBingWithFirefox()
  {
    searchSteps.givenIAmOnBingsHomePage();
    searchSteps.whenIsearchForPhrase("Partnet");
    searchSteps.thenIWillSeePartnetInResults();
  }
  
  @Test
  @PhantomJs
  @Ignore
  public void runPhanomJs()
  {
  }
  
  @Test
  @HTMLUnit
  @Ignore
  public void runHtmlUnit()
  {
  }
  
  @Test
  @Chrome
  @Ignore
  public void runFirefox()
  {
  }
  
}
