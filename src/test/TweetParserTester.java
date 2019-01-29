package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class test {

    class TweetParserTest {
        String tweet = "@Sarah hate #cats. Visit https://thecatsite.com now to buy cats";
        TweetParser tp = new TweetParser(tweet);

        @Test
        void testForMention() throws Exception {
            assertEquals(Arrays.asList(tp.isMention()).contains("@Sarah"), true);
            assertEquals(Arrays.asList(tp.isMention()).contains("@Ramsha"), false);
            assertEquals(Arrays.asList(tp.numberOfMentions()).contains("@Sarah"), 1);
            assertEquals(Arrays.asList(tp.getTopics()).iterator().hasNext(),true);

        }

        @Test
        void testForTopic() throws Exception {
            assertEquals(Arrays.asList(tp.isTopics()).contains("#cats"), true);
            assertEquals(Arrays.asList(tp.isTopics()).contains("#dogs"), false);
            assertEquals(Arrays.asList(tp.numberOfTopics()).contains("#cats"), 1);
            assertEquals(Arrays.asList(tp.getTopics()).iterator().hasNext(), true);


        }

        @Test
        void testForReferences() throws Exception {
            assertEquals(Arrays.asList(tp.isReferences()).contains("https://thecatsite.com"), true);
            assertEquals(Arrays.asList(tp.numberOfReferences()).contains("https://thecatsite.com"), 1);
            assertEquals(Arrays.asList(tp.isReferences()).contains("https://www.facebook.com"), false);
            assertEquals(Arrays.asList(tp.getReferences()).iterator().hasNext(),true);



        }
    }
}

/*import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.sun.tools.javac.util.Assert;

import jdk.internal.jline.internal.TestAccessible;

public class TweetParserTester implements TweetParser{

    @test
    public void TweetParserTest() {

    }    

    @test
    public void getMatchesTest() {
        
    }

    @test
    public void getTweetTest() {
        final String expected = "@Sarah hate #cats. Visit https://thecatsite.com now to buy cats";
        final String actual = tweet.getTweet();
        Assert.assertEquals(actual, expected);
    }

    @test
    public void getMentionsTest() {
        final String expected = "@Sarah";
        final String actual = tweet.getMentions();
        Assert.assertEquals(actual, expected);
    }

    @test
    public void getReferencesTest() {
        final String expected = "https://thecatsite.com";
        final String actual = tweet.getReferences();
        Assert.assertEquals(actual, expected);
    }

    @test 
    public void getTopicsTest() {
        final String expected = "#cats";
        final String actual = tweet.getTopicsTest();
        Assert.assertEquals(actual, expected);
    }
}
*/

