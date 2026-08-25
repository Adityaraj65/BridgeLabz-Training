package scenarioBased.StreamBuzz;

public class CreatorStats {
    String creatorName;
    double[] weeklyLikes;
    public CreatorStats(String creatorName,double[] weeklyLikes) {
    	this.creatorName=creatorName;
    	this.weeklyLikes=weeklyLikes;
    }
    public void setCreatorName() {
    	
    }
    public double getAverageWeeklyLike() {
    	double sum=0;
    	for(double d:weeklyLikes) {
    		sum+=d;
    	}
    	return sum/4;
    }
    public double[] getWeeklyLike() {
    	return weeklyLikes;
    }
    public String getName() {
    	return creatorName;
    }
    
}
