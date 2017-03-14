package com.coderscampus.customexceptions;

public class RunnableProgram
{
  public static void main (String[] args) throws Exception
  {
    int i =0;
    
    if (i == 0)
    {
      throw new CodersCampusException(new IllegalStateException("i was set to zero, so this caused the CodersCampusException"));
    }
  }
}
