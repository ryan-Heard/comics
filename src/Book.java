

public  abstract class Book {
  protected String title;
  protected Double issueNum;
  protected String grade;
  protected Double retailFor;
  protected int year;
  protected boolean slabbed = false;
  protected boolean signed =  false;

/**
 * [init description]
 * @param  {String} title [Series title for book]
 * @param  {Number} issueNum [Issue Number. 0 if unsure]
 * @param  {String} variantId [Books can be id by A-Z or another word and or number
 * combination that makes it distinct]
 */
  public Book(){
	  
  }
  
  public Book(String name, double label, String gradeId, Double amt, int year){
	  this.title = name;
	  this.issueNum = label;
	  this.grade = gradeId;
	  this.retailFor = amt;
	  this.year = year;
  }
  

  
  public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Double getIssueNum() {
	return issueNum;
}

public void setIssueNum(Double issueNum) {
	this.issueNum = issueNum;
}

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public Double getRetailFor() {
	return retailFor;
}

public void setRetailFor(Double retailFor) {
	this.retailFor = retailFor;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public boolean isSlabbed() {
	return slabbed;
}

public void setSlabbed(boolean slabbed) {
	this.slabbed = slabbed;
}

public boolean isSigned() {
	return signed;
}

public void setSigned(boolean signed) {
	this.signed = signed;
}

/**
   * Returns the description of the book.
   */
  public void summery(){
    System.out.println(this.title +" "+year+ " "+this.issueNum+" "+this.grade+" $"+this.retailFor);
  }

}
