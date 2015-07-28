

public class Book {
  private String title;
  private Double issueNum;
  private String grade;
  private Double retailFor;
  private int year;

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
  
  public void init(String name, double label, String gradeId,int year){
    this.title = name;
    this.issueNum = label;
    this.grade = gradeId;
    this.year = year;
  }

  
  /**
   * Returns the description of the book.
   */
  public void summery(){
    System.out.println(this.title +" "+year+ " "+this.issueNum+" "+this.grade+" $"+this.retailFor);
  }

}
