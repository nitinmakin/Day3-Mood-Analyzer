package com.bridgelabz.moodanalyzer;
import com.bridgelabz.moodanalyzer.service.MoodAnalyser;
import com.bridgelabz.moodanalyzer.service.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest
{

    /**
     * for checking Sad mood
     * when found SAD in message
     */
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
    /**
     * for checking happy mood
     * when not found SAD in message
     */
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

    /**
     * for throwing MoodAnalyzerException and display message
     * when message is null
     */
    @Test
    public void when_Entered_Null_Should_Throw_MoodAnalyzerException()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try
        {
             moodAnalyser.analyseMood();

        } catch (MoodAnalyzerException e)
        {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL, e.type);
            System.out.println(e.getMessage());
        }
    }
    /**
     * for throwing MoodAnalyzerException and display message
     * when message is empty
     */
    @Test
    public void when_Empty_Should_Return_Message()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try
        {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyzerException e)
        {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY, e.type);
            System.out.println(e.getMessage());
        }
    }

}
