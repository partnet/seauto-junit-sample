/* Copyright (c) 2014 Partnet, Inc. Confidential and Proprietary. */

package junit.sample.step;


import java.util.Map;

import javax.inject.Inject;

import junit.sample.config.framework.StoryContext;
import junit.sample.page.home.HomePage;
import junit.sample.page.search.SearchResultsPage;

import org.junit.Assert;

/**
 * @author <a href="mailto:bbarker@part.net">bbarker</a>
 */

public class SearchSteps
{
  
  @Inject
  private StoryContext context;
  
  public void givenIAmOnBingsHomePage()
  {
    context.site().open();
  }
  
  public void whenIsearchForPhrase(String searchPhrase)
  {
    context.getPage(HomePage.class)
      .setSearchPhrase(searchPhrase)
      .clickSearch();
  }
  
  public void thenIWillSeePartnetInResults()
  {
    Map<String, String> majorSearchResults = context.getPage(SearchResultsPage.class).getMajorSearchResults();
    
    String partnet = "Partnet";
    
    Assert.assertTrue(String.format("Major search result links in did not contain '%s'!", partnet), 
        majorSearchResults.containsKey(partnet));
  }
}
