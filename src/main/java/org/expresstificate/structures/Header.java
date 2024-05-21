package org.expresstificate.structures;

import org.expresstificate.interfaces.Structure;
import org.expresstificate.interfaces.annotations.NotNull;

public class Header implements Structure {
  @NotNull
  private String title;

  @NotNull
  private String subTitle;

  public Header(String title, String subTitle) {
    this.title = title;
    this.subTitle = subTitle;
    verify(validate());
  }
  public Header() {
    this("CERTIFICATE", "of achievement");
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public String getTitle() {
    return this.title;
  }

  public String getSubTitle() {
    return this.subTitle;
  }
}