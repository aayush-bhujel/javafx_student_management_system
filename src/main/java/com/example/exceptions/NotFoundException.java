package com.example.exceptions;

public class NotFoundException extends Exception {
  private final int errorCode = 404;
  private final String errorName = "Not Found";
  private final String errorTitle = String.valueOf(errorCode) + "-" + errorName;

  public NotFoundException(String errorMessage) {
    super(errorMessage);

  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public String getErrorTitle() {
    return this.errorTitle;
  }
}
