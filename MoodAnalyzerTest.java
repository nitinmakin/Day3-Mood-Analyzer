package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.font.CoreMetrics;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser = null;

    @Before
    public void objectCreation()
    {
        moodAnalyser = new MoodAnalyser();
    }
    @Test
    public void iAmInSadMoodShuldReturn_sad()
    {
        String mood = moodAnalyser.analyseMood("this is sad message");
        Assert.assertEquals("sad" , mood);
    }
}
