package uk.dangrew.wordsearch;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyObjectTest {
   
   private MyObject systemUnderTest;
   
   @BeforeEach
   public void initialiseSystemUnderTest() {
      systemUnderTest = new MyObject();
   }
   
   @Test
   public void shouldNotBeNull() {
      assertThat(systemUnderTest, notNullValue());
   }

}