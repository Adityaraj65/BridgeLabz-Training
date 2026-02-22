package resume_shortlisting_system;
import java.util.HashSet;
import java.util.Set;
public class Resume {
    private String name;
    Set<String> skill;
    private int matchCount;
    public Resume(String name,Set<String> set) {
        this.name = name;
        this.skill=new HashSet<>(set);
    }
    public String getName(){
        return name;
    }
    public int getCount(){
        return matchCount;
    }
    public Set<String> getSkill(){
        return this.skill;
    }
    public void SetMatchCount(int matchCount){
        this.matchCount=matchCount;
    }
    public String toString(){
        return "Name :"+name+"Skill :"+skill;
    }
}
