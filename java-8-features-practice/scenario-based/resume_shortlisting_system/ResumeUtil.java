package resume_shortlisting_system;

import java.util.*;
import java.util.stream.Collectors;

public class ResumeUtil {
    List<Resume> lis=new ArrayList<>();
    public void addResume(Resume e ){
        lis.add(e);
        System.out.println("resume added");
    }
    public List<Resume> matchCount(Set<String> requiredSkill) throws InvalidResumeException{
        if(requiredSkill==null||requiredSkill.isEmpty()){
            throw new InvalidResumeException("required skill cannot be empty");
        }
        for(Resume r:lis){
            if (r == null || r.getSkill() == null || r.getSkill().isEmpty()) {
                throw new InvalidResumeException("Invalid resume found");
            }
            Set<String>matchedSkill=new HashSet<>(r.getSkill());
            matchedSkill.retainAll(requiredSkill);
            r.SetMatchCount(matchedSkill.size());
        }

        List<Resume>sortedList=lis.stream().sorted(Comparator.comparing(Resume::getCount).reversed()).collect(Collectors.toList());
        return sortedList;
    }

}
