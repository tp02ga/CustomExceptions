package com.coderscampus.customexceptions;

public class CodersCampusException extends Exception
{
  private static final long serialVersionUID = 5468636753660377113L;

  public CodersCampusException()
  {

  }

  public CodersCampusException(String message)
  {
    super(message);
  }

  public CodersCampusException(Throwable cause)
  {
    super(cause);
  }

  public CodersCampusException(String message, Throwable cause)
  {
    super(message, cause);
  }
}
