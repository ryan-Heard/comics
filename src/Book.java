

public class Book {
  private String title;
  private Double issueNum;
  private String grade;
  private Double retailFor;

/**
 * [init description]
 * @param  {String} title [Series title for book]
 * @param  {Number} issueNum [Issue Number. 0 if unsure]
 * @param  {String} variantId [Books can be id by A-Z or another word and or number
 * combination that makes it distinct]
 */
  public void init(String name, Double number, String gradeId){
    this.title = name;
    this.issueNum = number;
    this.grade = gradeId;
  }

  /**
   * Returns the description of the book.
   */
  public void summery(){
    System.out.println(this.title +" "+this.issueNum+" "+this.grade);
  }

}
