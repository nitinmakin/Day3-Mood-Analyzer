package com.bridgelabz.moodanalyzer.service;

public class MoodAnalyzerException extends Exception
{
  public enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY
    }
   public ExceptionType type;
    public MoodAnalyzerException(ExceptionType type, String message)
    {
        super(message);
        this.type = type;
    }
}
