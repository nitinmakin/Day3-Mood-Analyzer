package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.font.CoreMetrics;

public class MoodAnalyserTest
{
     @Test
    public void iAmIn_SadMood_ShuldReturn_sad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad" , mood);
    }

     @Test
    public void iAmIn_anyMood_ShuldReturn_happy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("happy" , mood);
    }

     @Test
    public void null_Should_Return_Happy_Mood()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("happy" , mood);
    }

}
