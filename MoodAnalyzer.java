package com.bridgelabz.moodanalyzer.service;

public class MoodAnalyser
{
    private String message;
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try
        {
            if (message.contains("sad"))
                return "sad";
            else
                return "happy";
        } catch (NullPointerException e)
        {
           throw new MoodAnalyzerException("please enter valid message");
        }
    }
}
