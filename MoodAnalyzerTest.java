package com.bridgelabz.moodanalyzer;
import com.bridgelabz.moodanalyzer.service.MoodAnalyser;
import com.bridgelabz.moodanalyzer.service.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class MoodAnalyserTest
{
    @Test
    public void iAmIn_SadMood_ShouldReturn_Sad() throws MoodAnalyzerException
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String  mood = moodAnalyser.analyseMood();
        try
        {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("sad" , mood);
    }
    @Test
    public void iAmIn_anyMood_ShouldReturn_Happy() throws MoodAnalyzerException
    {

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        try
        {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("happy" , mood);
    }

    @Test
    public void when_Null_Should_Return_Message() throws MoodAnalyzerException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e)
        {
            Assert.assertEquals("please enter valid message", e.getMessage());
            System.out.println("enter valid message");
        }


    }

}
