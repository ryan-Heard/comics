

public class Book {
  private String title;
  private String issueNum;
  private String grade;
  private Double retailFor;

/**
 * [init description]
 * @param  {String} title [Series title for book]
 * @param  {Number} issueNum [Issue Number. 0 if unsure]
 * @param  {String} variantId [Books can be id by A-Z or another word and or number
 * combination that makes it distinct]
 */
  public Book(){
	  
  }
  
  public Book(String name, String label, String gradeId, Double amt){
	  this.title = name;
	  this.issueNum = label;
	  this.grade = gradeId;
	  this.retailFor = amt;
  }
  
  public void init(String name, String label, String gradeId){
    this.title = name;
    this.issueNum = label;
    this.grade = gradeId;
  }

  
  /**
   * Returns the description of the book.
   */
  public void summery(){
    System.out.println(this.title +" "+this.issueNum+" "+this.grade+"$"+this.retailFor);
  }

}
