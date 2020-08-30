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
    public void iAmIn_SadMood_ShuldReturn_sad()
    {
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("sad" , mood);
    }

     @Test
    public void iAmIn_AnyMood_ShuldReturn_Happy()
    {
        String mood = moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("happy" , mood);
    }


}
