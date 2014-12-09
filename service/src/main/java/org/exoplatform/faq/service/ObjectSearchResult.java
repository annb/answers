/*
 * Copyright (C) 2003-2008 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.faq.service;

import java.util.Date;

public class ObjectSearchResult {
  private String id;

  private String path ;

  private String type;

  private String name;

  private String description;

  private String icon;

  private String link;

  private double ratingOfQuestion = 0;

  private int    numberOfAnswer   = 0;

  private int    numberOfComment  = 0;

  private Date   createdDate;
  
  private String excerpt = null;
  
  private long relevancy = 0;

  /**
   * Instantiates a new object form search.
   */
  public ObjectSearchResult() {
  }

  /**
   * This method get Id of category or question filter 
   * 
   * @return id of question or category 
   */
  public String getId() {
    return id;
  }

  /**
   * With each value filter, this id add to object
   * 
   * @param id of category or question when result search
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * This method return category or question
   * 
   * @return type
   */
  public String getType() {
    return type;
  }

  /**
   *  With each value filter, this type add to object
   * 
   * @param type return category or question
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * This method get name of category or question
   * 
   * @return name is question or name of category
   */
  public String getName() {
    return name;
  }

  /**
   * This method add name category or question to object 
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This method get created date of category or question
   * 
   * @return createdDate
   */
  public Date getCreatedDate() {
    return createdDate;
  }

  /**
   * This method add created date of category or question to object 
   * 
   * @param date
   */
  public void setCreatedDate(Date date) {
    this.createdDate = date;
  }

  /**
   * This method return icon category or question
   * 
   * @return icon
   */
  public String getIcon() {
    return icon;
  }

  /**
   * This method add icon to object.
   * if type is category then name icon is FAQCategorySearch
   * if type is question and not response then name icon NotResponseSearch
   * if type is question and response then name icon QuestionSearch
   * 
   * @param icon
   */
  public void setIcon(String icon) {
    this.icon = icon;
  }

  /**
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * @param path the path to set
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * @return the ratingOfQuestion
   */
  public double getRatingOfQuestion() {
    return ratingOfQuestion;
  }

  /**
   * @param ratingOfQuestion the ratingOfQuestion to set
   */
  public void setRatingOfQuestion(double ratingOfQuestion) {
    this.ratingOfQuestion = ratingOfQuestion;
  }

  /**
   * @return the numberOfAnswer
   */
  public int getNumberOfAnswer() {
    return numberOfAnswer;
  }

  /**
   * @param numberOfAnswer the numberOfAnswer to set
   */
  public void setNumberOfAnswer(int numberOfAnswer) {
    this.numberOfAnswer = numberOfAnswer;
  }

  /**
   * @return the numberOfComment
   */
  public int getNumberOfComment() {
    return numberOfComment;
  }

  /**
   * @param numberOfComment the numberOfComment to set
   */
  public void setNumberOfComment(int numberOfComment) {
    this.numberOfComment = numberOfComment;
  }

  /**
   * @return
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the link
   */
  public String getLink() {
    return link;
  }

  /**
   * @param link the link to set
   */
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * gets excerpt
   * @return
   */
  public String getExcerpt() {
    return excerpt == null ? "" : excerpt;
  }

  /**
   * sets excerpt
   * @param excerpt
   */
  public void setExcerpt(String excerpt) {
    this.excerpt = excerpt;
  }

  /**
   * gets relevancy
   * @return
   */
  public long getRelevancy() {
    return relevancy;
  }

  /**
   * sets relevancy
   * @param relevancy
   */
  public void setRelevancy(long relevancy) {
    this.relevancy = relevancy;
  }
  
  
}
