
public class MCSBook extends Book {
	protected double tenPointGrade = 0;
	protected String tenPointLabel = "N/A";
	 
	 
	  public MCSBook(String name, double label, String gradeId, Double amt, int year){
		  this.title = name;
		  this.issueNum = label;
		  this.grade = gradeId;
		  this.retailFor = amt;
		  this.year = year;
		  getTenPointInfo();
	  }
	  
	  private boolean getTenPointInfo(){
		  String[] tenPointParts;
		  if(this.grade.contains("-")){
			  tenPointParts = this.grade.split("-");
			  
			 this.tenPointLabel = tenPointParts[1].trim(); 
			 this.tenPointGrade = Double.parseDouble(tenPointParts[1]);
			  
			  return true; 
		  }
		  
		  return false;
	  }
	  
	  public void summery(){
		    System.out.println(this.title +" "+year+ " "
		    		+this.issueNum+" "+this.grade+" $"
		    		+this.retailFor+" "
		    		+this.tenPointLabel);
		  }
}
